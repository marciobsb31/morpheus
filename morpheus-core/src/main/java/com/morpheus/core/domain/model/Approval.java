package com.morpheus.core.domain.model;

import java.time.Instant;

public record Approval(
        String id,
        ExecutionRequest request,
        String status,
        Instant requestedAt,
        Instant expiresAt,
        String decidedBy) {
    public Approval {
        if (id == null || id.isBlank()) throw new IllegalArgumentException("Approval id cannot be null or blank");
        if (request == null) throw new IllegalArgumentException("request cannot be null");
        if (status == null || status.isBlank()) throw new IllegalArgumentException("status cannot be null or blank");
    }
}
