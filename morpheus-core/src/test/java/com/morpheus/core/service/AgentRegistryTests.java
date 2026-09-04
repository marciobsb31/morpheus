package com.morpheus.core.service;

import com.morpheus.core.domain.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AgentRegistryTests {

    private CapabilityRegistryService capabilityRegistryService;
    private AgentRegistryService agentRegistryService;

    @BeforeEach
    void setUp() {
        capabilityRegistryService = new CapabilityRegistryService();
        agentRegistryService = new AgentRegistryService(capabilityRegistryService);
    }

    @Test
    void testRegisterAgentAndCapabilities() {
        Capability cap = new Capability(new CapabilityId("cap-1"), "Cap 1", "Desc", RiskLevel.LOW, Set.of());
        Agent agent = new Agent(new AgentId("agent-1"), "Agent 1", "1.0", "Desc", Set.of(cap), Set.of(), "HEALTHY", "ACTIVE");
        
        agentRegistryService.register(agent);
        
        assertTrue(agentRegistryService.get(new AgentId("agent-1")).isPresent());
        assertEquals(1, agentRegistryService.listAll().size());
        
        assertTrue(capabilityRegistryService.get(new CapabilityId("cap-1")).isPresent());
        assertEquals(1, capabilityRegistryService.listAll().size());
    }

    @Test
    void testFindAgentsByCapability() {
        Capability cap = new Capability(new CapabilityId("cap-1"), "Cap 1", "Desc", RiskLevel.LOW, Set.of());
        Agent agent = new Agent(new AgentId("agent-1"), "Agent 1", "1.0", "Desc", Set.of(cap), Set.of(), "HEALTHY", "ACTIVE");
        
        agentRegistryService.register(agent);
        
        List<Agent> found = agentRegistryService.findAgentsByCapability(new CapabilityId("cap-1"));
        assertEquals(1, found.size());
        assertEquals("agent-1", found.get(0).id().value());
    }

    @Test
    void testUnregisterAgent() {
        Capability cap = new Capability(new CapabilityId("cap-1"), "Cap 1", "Desc", RiskLevel.LOW, Set.of());
        Agent agent = new Agent(new AgentId("agent-1"), "Agent 1", "1.0", "Desc", Set.of(cap), Set.of(), "HEALTHY", "ACTIVE");
        
        agentRegistryService.register(agent);
        agentRegistryService.unregister(new AgentId("agent-1"));
        
        assertFalse(agentRegistryService.get(new AgentId("agent-1")).isPresent());
        assertEquals(0, agentRegistryService.listAll().size());
    }
}
