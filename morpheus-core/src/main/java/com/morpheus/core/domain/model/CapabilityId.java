package com.morpheus.core.domain.model;

public record CapabilityId(String value) {
    public CapabilityId {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("CapabilityId cannot be null or blank");
        }
    }
}
