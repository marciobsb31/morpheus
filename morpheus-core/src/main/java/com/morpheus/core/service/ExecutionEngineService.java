package com.morpheus.core.service;

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

    public ExecutionEngineService(PlannerService plannerService, EventBus eventBus) {
        this.plannerService = plannerService;
        this.eventBus = eventBus;
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

        return correlationId;
    }
}
