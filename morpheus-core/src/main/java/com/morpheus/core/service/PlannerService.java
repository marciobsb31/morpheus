package com.morpheus.core.service;

import com.morpheus.core.domain.model.Agent;
import com.morpheus.core.domain.model.Capability;
import com.morpheus.core.domain.model.Intent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlannerService {

    private static final Logger logger = LoggerFactory.getLogger(PlannerService.class);
    private final AgentRegistryService agentRegistryService;
    private final CapabilityRegistryService capabilityRegistryService;

    public PlannerService(AgentRegistryService agentRegistryService, CapabilityRegistryService capabilityRegistryService) {
        this.agentRegistryService = agentRegistryService;
        this.capabilityRegistryService = capabilityRegistryService;
    }

    public Optional<PlanResult> plan(Intent intent) {
        // Very simplistic planner for MVP:
        // We match intent name to capability name for now.
        logger.info("Planning for intent: {}", intent.name());

        List<Capability> capabilities = capabilityRegistryService.listAll();
        
        for (Capability cap : capabilities) {
            if (cap.name().equalsIgnoreCase(intent.name())) {
                List<Agent> matchingAgents = agentRegistryService.findAgentsByCapability(cap.id());
                if (!matchingAgents.isEmpty()) {
                    // Pick the first active and healthy one (simplified)
                    Agent selectedAgent = matchingAgents.get(0);
                    logger.info("Selected Agent: {} with Capability: {}", selectedAgent.id().value(), cap.id().value());
                    return Optional.of(new PlanResult(selectedAgent, cap));
                }
            }
        }
        
        logger.warn("No suitable capability or agent found for intent: {}", intent.name());
        return Optional.empty();
    }

    public record PlanResult(Agent agent, Capability capability) {}
}
