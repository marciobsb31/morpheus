package com.morpheus.core.service;

import com.morpheus.core.domain.model.*;
import com.morpheus.core.service.bus.LocalEventBusImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ApprovalEngineTests {

    private CapabilityRegistryService capabilityRegistry;
    private AgentRegistryService agentRegistry;
    private PlannerService plannerService;
    private LocalEventBusImpl eventBus;
    private PolicyEngineService policyEngineService;
    private ApprovalEngineService approvalEngineService;
    private ExecutionEngineService executionEngine;

    @BeforeEach
    void setUp() {
        capabilityRegistry = new CapabilityRegistryService();
        agentRegistry = new AgentRegistryService(capabilityRegistry);
        plannerService = new PlannerService(agentRegistry, capabilityRegistry);
        eventBus = new LocalEventBusImpl();
        policyEngineService = new PolicyEngineService();
        approvalEngineService = new ApprovalEngineService(eventBus);
        executionEngine = new ExecutionEngineService(plannerService, eventBus, policyEngineService, approvalEngineService);
    }

    @Test
    void testLowRiskApprovalBypass() {
        Capability cap = new Capability(new CapabilityId("cap-low"), "LowRisk", "Desc", RiskLevel.LOW, Set.of());
        Agent agent = new Agent(new AgentId("agent-1"), "Agent", "1.0", "Desc", Set.of(cap), Set.of(), "HEALTHY", "ACTIVE");
        agentRegistry.register(agent);

        Intent intent = new Intent("LowRisk", Map.of());
        UserContext ctx = new UserContext("user-1", "device-1", "local");
        
        CorrelationId corrId = executionEngine.dispatchIntent(intent, ctx);
        
        assertNotNull(corrId);
        
        // Should directly publish ExecutionRequestCreated
        assertEquals(1, eventBus.getEventQueue().size());
        EventEnvelope<?> envelope = eventBus.getEventQueue().poll();
        assertEquals("ExecutionRequestCreated", envelope.eventType());
        assertEquals(0, approvalEngineService.listPendingApprovals().size());
    }

    @Test
    void testHighRiskRequiresApproval() {
        Capability cap = new Capability(new CapabilityId("cap-high"), "HighRisk", "Desc", RiskLevel.HIGH, Set.of());
        Agent agent = new Agent(new AgentId("agent-2"), "Agent 2", "1.0", "Desc", Set.of(cap), Set.of(), "HEALTHY", "ACTIVE");
        agentRegistry.register(agent);

        Intent intent = new Intent("HighRisk", Map.of());
        UserContext ctx = new UserContext("user-1", "device-1", "local");
        
        CorrelationId corrId = executionEngine.dispatchIntent(intent, ctx);
        
        assertNotNull(corrId);
        
        // Should publish ApprovalRequired
        assertEquals(1, eventBus.getEventQueue().size());
        EventEnvelope<?> envelope = eventBus.getEventQueue().poll();
        assertEquals("ApprovalRequired", envelope.eventType());
        
        // Should create pending approval
        var pendingList = approvalEngineService.listPendingApprovals();
        assertEquals(1, pendingList.size());
        
        Approval approval = pendingList.get(0);
        assertEquals("PENDING", approval.status());
        
        // Approve it
        approvalEngineService.approve(approval.id(), "admin");
        
        // Should now publish ExecutionRequestCreated
        assertEquals(1, eventBus.getEventQueue().size());
        EventEnvelope<?> execEnvelope = eventBus.getEventQueue().poll();
        assertEquals("ExecutionRequestCreated", execEnvelope.eventType());
        
        // Approval should be APPROVED
        assertEquals("APPROVED", approvalEngineService.getApproval(approval.id()).get().status());
    }
}
