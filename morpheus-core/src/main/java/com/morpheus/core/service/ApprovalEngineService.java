package com.morpheus.core.service;

import com.morpheus.core.domain.model.Approval;
import com.morpheus.core.domain.model.EventEnvelope;
import com.morpheus.core.domain.model.ExecutionRequest;
import com.morpheus.core.service.bus.EventBus;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class ApprovalEngineService {

    private final ConcurrentHashMap<String, Approval> approvals = new ConcurrentHashMap<>();
    private final EventBus eventBus;

    public ApprovalEngineService(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public Approval createApproval(ExecutionRequest request) {
        String approvalId = UUID.randomUUID().toString();
        Approval approval = new Approval(
                approvalId,
                request,
                "PENDING",
                Instant.now(),
                Instant.now().plusSeconds(3600), // 1 hour expiration for now
                null
        );
        approvals.put(approvalId, approval);

        // Publish ApprovalRequired event
        EventEnvelope<Approval> envelope = new EventEnvelope<>(
                UUID.randomUUID().toString(),
                "ApprovalRequired",
                "1.0",
                "morpheus-core",
                Instant.now(),
                request.correlationId(),
                null,
                approval
        );
        eventBus.publish(envelope);

        return approval;
    }

    public List<Approval> listPendingApprovals() {
        return approvals.values().stream()
                .filter(a -> "PENDING".equals(a.status()))
                .toList();
    }

    public Optional<Approval> getApproval(String id) {
        return Optional.ofNullable(approvals.get(id));
    }

    public void approve(String id, String decidedBy) {
        Approval approval = approvals.get(id);
        if (approval == null) throw new IllegalArgumentException("Approval not found");
        if (!"PENDING".equals(approval.status())) throw new IllegalStateException("Approval is not pending");

        Approval updated = new Approval(
                approval.id(),
                approval.request(),
                "APPROVED",
                approval.requestedAt(),
                approval.expiresAt(),
                decidedBy
        );
        approvals.put(id, updated);

        // Resume execution by publishing the original request
        EventEnvelope<ExecutionRequest> envelope = new EventEnvelope<>(
                UUID.randomUUID().toString(),
                "ExecutionRequestCreated",
                "1.0",
                "morpheus-core",
                Instant.now(),
                approval.request().correlationId(),
                null,
                approval.request()
        );
        eventBus.publish(envelope);
    }

    public void reject(String id, String decidedBy) {
        Approval approval = approvals.get(id);
        if (approval == null) throw new IllegalArgumentException("Approval not found");
        if (!"PENDING".equals(approval.status())) throw new IllegalStateException("Approval is not pending");

        Approval updated = new Approval(
                approval.id(),
                approval.request(),
                "REJECTED",
                approval.requestedAt(),
                approval.expiresAt(),
                decidedBy
        );
        approvals.put(id, updated);
        
        // Could publish an ApprovalRejected event, but we'll keep it simple for now
    }
}
