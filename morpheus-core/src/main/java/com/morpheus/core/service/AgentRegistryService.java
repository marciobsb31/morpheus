package com.morpheus.core.service;

import com.morpheus.core.domain.model.Agent;
import com.morpheus.core.domain.model.AgentId;
import com.morpheus.core.domain.model.CapabilityId;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Service
public class AgentRegistryService {
    
    private final ConcurrentHashMap<AgentId, Agent> agents = new ConcurrentHashMap<>();
    private final CapabilityRegistryService capabilityRegistry;

    public AgentRegistryService(CapabilityRegistryService capabilityRegistry) {
        this.capabilityRegistry = capabilityRegistry;
    }

    public void register(Agent agent) {
        if (agent == null) throw new IllegalArgumentException("Agent cannot be null");
        agents.put(agent.id(), agent);
        
        agent.capabilities().forEach(capabilityRegistry::register);
    }

    public void unregister(AgentId agentId) {
        if (agentId == null) throw new IllegalArgumentException("AgentId cannot be null");
        Agent removed = agents.remove(agentId);
        // We could also unregister its unique capabilities if no other agent provides them,
        // but for now, we just unregister the agent.
    }

    public Optional<Agent> get(AgentId agentId) {
        if (agentId == null) return Optional.empty();
        return Optional.ofNullable(agents.get(agentId));
    }

    public List<Agent> listAll() {
        return new ArrayList<>(agents.values());
    }

    public List<Agent> findAgentsByCapability(CapabilityId capabilityId) {
        if (capabilityId == null) return List.of();
        return agents.values().stream()
                .filter(a -> a.capabilities().stream().anyMatch(c -> c.id().equals(capabilityId)))
                .collect(Collectors.toList());
    }
}
