package com.morpheus.core.domain.model;

public record UserContext(
        String userId,
        String deviceId,
        String location) {
    public UserContext {
        if (userId == null || userId.isBlank()) throw new IllegalArgumentException("userId cannot be null or blank");
    }
}
