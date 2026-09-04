package com.morpheus.core.domain.model;

public record AgentId(String value) {
    public AgentId {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("AgentId cannot be null or blank");
        }
    }
}
