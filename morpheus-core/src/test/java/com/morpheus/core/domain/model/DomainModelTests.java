package com.morpheus.core.domain.model;

import org.junit.jupiter.api.Test;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class DomainModelTests {

    @Test
    void testAgentIdCreation() {
        AgentId id = new AgentId("agent-123");
        assertEquals("agent-123", id.value());
        
        assertThrows(IllegalArgumentException.class, () -> new AgentId(null));
        assertThrows(IllegalArgumentException.class, () -> new AgentId(""));
    }

    @Test
    void testCorrelationIdGeneration() {
        CorrelationId id = CorrelationId.generate();
        assertNotNull(id.value());
        assertFalse(id.value().isBlank());
    }

    @Test
    void testCapabilityCreation() {
        Permission perm = new Permission("system", "read");
        Capability cap = new Capability(new CapabilityId("cap-1"), "Read System", "Reads system info", RiskLevel.LOW, Set.of(perm));
        
        assertEquals("cap-1", cap.id().value());
        assertEquals("Read System", cap.name());
        assertEquals(RiskLevel.LOW, cap.riskLevel());
        assertTrue(cap.requiredPermissions().contains(perm));
    }
    
    @Test
    void testAgentCreation() {
        Agent agent = new Agent(
            new AgentId("agent-1"),
            "System Agent",
            "1.0",
            "Agent description",
            Set.of(),
            Set.of(),
            "HEALTHY",
            "ACTIVE"
        );
        assertEquals("agent-1", agent.id().value());
        assertEquals("System Agent", agent.name());
        assertTrue(agent.capabilities().isEmpty());
    }
    
    @Test
    void testExecutionRequest() {
        UserContext ctx = new UserContext("user-1", "device-1", "local");
        ExecutionRequest request = new ExecutionRequest(
            CorrelationId.generate(),
            new AgentId("agent-1"),
            new CapabilityId("cap-1"),
            Map.of("param1", "value1"),
            ctx
        );
        assertNotNull(request.correlationId());
        assertEquals("value1", request.parameters().get("param1"));
        assertEquals("user-1", request.userContext().userId());
    }
}
