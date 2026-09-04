package com.morpheus.core.domain.model;

import java.util.Map;

public record ExecutionRequest(
        CorrelationId correlationId,
        AgentId agentId,
        CapabilityId capabilityId,
        Map<String, Object> parameters,
        UserContext userContext) {
    public ExecutionRequest {
        if (correlationId == null) throw new IllegalArgumentException("correlationId cannot be null");
        if (agentId == null) throw new IllegalArgumentException("agentId cannot be null");
        if (capabilityId == null) throw new IllegalArgumentException("capabilityId cannot be null");
        if (parameters == null) parameters = Map.of();
    }
}
