package com.morpheus.core.domain.model;

public record Permission(String resource, String action) {
    public Permission {
        if (resource == null || resource.isBlank()) {
            throw new IllegalArgumentException("Permission resource cannot be null or blank");
        }
        if (action == null || action.isBlank()) {
            throw new IllegalArgumentException("Permission action cannot be null or blank");
        }
    }
}
