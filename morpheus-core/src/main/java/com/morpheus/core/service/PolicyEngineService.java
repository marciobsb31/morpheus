package com.morpheus.core.service;

import com.morpheus.core.domain.model.Capability;
import com.morpheus.core.domain.model.RiskLevel;
import org.springframework.stereotype.Service;

@Service
public class PolicyEngineService {

    public PolicyResult evaluate(Capability capability) {
        if (capability == null) {
            throw new IllegalArgumentException("Capability cannot be null");
        }
        
        if (capability.riskLevel() == RiskLevel.LOW) {
            return new PolicyResult(PolicyDecision.APPROVED, "Risk level is LOW");
        } else {
            return new PolicyResult(PolicyDecision.PENDING_APPROVAL, "Risk level requires manual approval");
        }
    }

    public enum PolicyDecision {
        APPROVED,
        PENDING_APPROVAL,
        DENIED
    }

    public record PolicyResult(PolicyDecision decision, String reason) {}
}
