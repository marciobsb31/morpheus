package com.morpheus.core.domain.model;

import java.util.Set;

public record Agent(
        AgentId id,
        String name,
        String version,
        String description,
        Set<Capability> capabilities,
        Set<Permission> grantedPermissions,
        String status) {
    public Agent {
        if (id == null) throw new IllegalArgumentException("Agent id cannot be null");
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Agent name cannot be null or blank");
        if (capabilities == null) capabilities = Set.of();
        if (grantedPermissions == null) grantedPermissions = Set.of();
    }
}
