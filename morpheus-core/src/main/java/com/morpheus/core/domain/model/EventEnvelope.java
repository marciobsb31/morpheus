package com.morpheus.core.domain.model;

import java.time.Instant;

public record EventEnvelope<T>(
        String eventId,
        String eventType,
        String eventVersion,
        String source,
        Instant timestamp,
        CorrelationId correlationId,
        String causationId,
        T payload) {
    public EventEnvelope {
        if (eventId == null || eventId.isBlank()) throw new IllegalArgumentException("eventId cannot be null or blank");
        if (eventType == null || eventType.isBlank()) throw new IllegalArgumentException("eventType cannot be null or blank");
        if (timestamp == null) throw new IllegalArgumentException("timestamp cannot be null");
        if (correlationId == null) throw new IllegalArgumentException("correlationId cannot be null");
        if (payload == null) throw new IllegalArgumentException("payload cannot be null");
    }
}
