package com.morpheus.core.service;

import com.morpheus.core.domain.model.*;
import com.morpheus.core.service.bus.LocalEventBusImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ExecutionEngineTests {

    private CapabilityRegistryService capabilityRegistry;
    private AgentRegistryService agentRegistry;
    private PlannerService plannerService;
    private LocalEventBusImpl eventBus;
    private PolicyEngineService policyEngineService;
    private ApprovalEngineService approvalEngineService;
    private AuditService auditService;
    private ExecutionEngineService executionEngine;

    @BeforeEach
    void setUp() {
        capabilityRegistry = new CapabilityRegistryService();
        agentRegistry = new AgentRegistryService(capabilityRegistry);
        plannerService = new PlannerService(agentRegistry, capabilityRegistry);
        eventBus = new LocalEventBusImpl();
        policyEngineService = new PolicyEngineService();
        auditService = new AuditService(null) {
            @Override
            public void log(AuditLog log) {
                // mock behavior, do nothing
            }
        };
        approvalEngineService = new ApprovalEngineService(eventBus, auditService);
        executionEngine = new ExecutionEngineService(plannerService, eventBus, policyEngineService, approvalEngineService, auditService);
    }

    @Test
    void testDispatchIntentSuccess() {
        // Setup Agent and Capability
        Capability cap = new Capability(new CapabilityId("cap-search"), "SearchWeb", "Desc", RiskLevel.LOW, Set.of());
        Agent agent = new Agent(new AgentId("agent-1"), "Web Searcher", "1.0", "Desc", Set.of(cap), Set.of(), "HEALTHY", "ACTIVE");
        agentRegistry.register(agent);

        // Submit Intent
        Intent intent = new Intent("SearchWeb", Map.of("query", "morpheus"));
        UserContext ctx = new UserContext("user-1", "device-1", "local");
        
        CorrelationId corrId = executionEngine.dispatchIntent(intent, ctx);
        
        assertNotNull(corrId);
        
        // Verify EventBus
        assertEquals(1, eventBus.getEventQueue().size());
        EventEnvelope<?> envelope = eventBus.getEventQueue().poll();
        assertNotNull(envelope);
        assertEquals("ExecutionRequestCreated", envelope.eventType());
        assertEquals(corrId, envelope.correlationId());
        
        ExecutionRequest request = (ExecutionRequest) envelope.payload();
        assertEquals("agent-1", request.agentId().value());
        assertEquals("cap-search", request.capabilityId().value());
        assertEquals("morpheus", request.parameters().get("query"));
    }

    @Test
    void testDispatchIntentFailureNoAgent() {
        Intent intent = new Intent("UnknownIntent", Map.of());
        UserContext ctx = new UserContext("user-1", "device-1", "local");
        
        assertThrows(IllegalArgumentException.class, () -> {
            executionEngine.dispatchIntent(intent, ctx);
        });
        
        assertEquals(0, eventBus.getEventQueue().size());
    }
}
