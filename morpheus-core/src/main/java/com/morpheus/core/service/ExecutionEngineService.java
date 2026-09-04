package com.morpheus.core.service;

import com.morpheus.core.domain.model.AuditLog;
import com.morpheus.core.domain.model.CorrelationId;
import com.morpheus.core.domain.model.EventEnvelope;
import com.morpheus.core.domain.model.ExecutionRequest;
import com.morpheus.core.domain.model.Intent;
import com.morpheus.core.domain.model.UserContext;
import com.morpheus.core.service.bus.EventBus;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.UUID;

@Service
public class ExecutionEngineService {

    private final PlannerService plannerService;
    private final EventBus eventBus;
    private final PolicyEngineService policyEngineService;
    private final ApprovalEngineService approvalEngineService;
    private final AuditService auditService;

    public ExecutionEngineService(PlannerService plannerService, EventBus eventBus, 
                                  PolicyEngineService policyEngineService, ApprovalEngineService approvalEngineService,
                                  AuditService auditService) {
        this.plannerService = plannerService;
        this.eventBus = eventBus;
        this.policyEngineService = policyEngineService;
        this.approvalEngineService = approvalEngineService;
        this.auditService = auditService;
    }

    public CorrelationId dispatchIntent(Intent intent, UserContext userContext) {
        CorrelationId correlationId = CorrelationId.generate();

        PlannerService.PlanResult plan = plannerService.plan(intent)
                .orElseThrow(() -> new IllegalArgumentException("No agent or capability found to fulfill intent: " + intent.name()));

        ExecutionRequest request = new ExecutionRequest(
                correlationId,
                plan.agent().id(),
                plan.capability().id(),
                intent.parameters(),
                userContext
        );

        PolicyEngineService.PolicyResult policyResult = policyEngineService.evaluate(plan.capability());

        AuditLog.AuditLogBuilder auditLogBuilder = AuditLog.builder()
                .id(UUID.randomUUID())
                .timestamp(Instant.now())
                .actorId(userContext.userId())
                .agentId(plan.agent().id().value())
                .capability(plan.capability().id().value())
                .decision(policyResult.decision().name())
                .policyVersion("1.0")
                .risk(plan.capability().riskLevel().name())
                .correlationId(correlationId.value());

        if (policyResult.decision() == PolicyEngineService.PolicyDecision.APPROVED) {
            EventEnvelope<ExecutionRequest> envelope = new EventEnvelope<>(
                    UUID.randomUUID().toString(),
                    "ExecutionRequestCreated",
                    "1.0",
                    "morpheus-core",
                    Instant.now(),
                    correlationId,
                    null,
                    request
            );
            eventBus.publish(envelope);
            
            auditLogBuilder.result("DISPATCHED");
            auditService.log(auditLogBuilder.build());
        } else if (policyResult.decision() == PolicyEngineService.PolicyDecision.PENDING_APPROVAL) {
            var approval = approvalEngineService.createApproval(request);
            auditLogBuilder.approvalId(approval.id());
            auditLogBuilder.result("PENDING_APPROVAL");
            auditService.log(auditLogBuilder.build());
        } else {
            auditLogBuilder.result("DENIED");
            auditService.log(auditLogBuilder.build());
            throw new IllegalStateException("Execution request denied by policy engine: " + policyResult.reason());
        }

        return correlationId;
    }
}
