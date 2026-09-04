package com.morpheus.core.domain.model;

import java.util.Map;

public record Intent(
        String name,
        Map<String, Object> parameters) {
    public Intent {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Intent name cannot be null or blank");
        if (parameters == null) parameters = Map.of();
    }
}
