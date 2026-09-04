package com.morpheus.core.domain.model;

import java.util.Map;

public record ExecutionResult(
        CorrelationId correlationId,
        ExecutionStatus status,
        Map<String, Object> data,
        String errorMessage) {
    public ExecutionResult {
        if (correlationId == null) throw new IllegalArgumentException("correlationId cannot be null");
        if (status == null) throw new IllegalArgumentException("status cannot be null");
        if (data == null) data = Map.of();
    }
}
