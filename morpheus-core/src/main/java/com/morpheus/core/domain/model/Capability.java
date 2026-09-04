package com.morpheus.core.domain.model;

import java.util.Set;

public record Capability(
        CapabilityId id,
        String name,
        String description,
        RiskLevel riskLevel,
        Set<Permission> requiredPermissions) {
    public Capability {
        if (id == null) throw new IllegalArgumentException("Capability id cannot be null");
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Capability name cannot be null or blank");
        if (riskLevel == null) throw new IllegalArgumentException("RiskLevel cannot be null");
        if (requiredPermissions == null) requiredPermissions = Set.of();
    }
}
