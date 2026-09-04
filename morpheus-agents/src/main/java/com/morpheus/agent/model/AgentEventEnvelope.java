package com.morpheus.agent.model;

import java.time.Instant;
import java.util.Map;

public record AgentEventEnvelope(
        String eventId,
        String eventType,
        String version,
        String source,
        Instant timestamp,
        Map<String, Object> correlationId,
        String tenantId,
        Map<String, Object> payload
) {}
