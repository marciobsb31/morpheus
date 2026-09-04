package com.morpheus.agent.service;

import com.morpheus.agent.executor.CapabilityExecutor;
import com.morpheus.agent.executor.PowerShellExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class AgentExecutionEngine {

    private static final Logger logger = LoggerFactory.getLogger(AgentExecutionEngine.class);
    private final Map<String, CapabilityExecutor> executors = new ConcurrentHashMap<>();

    public AgentExecutionEngine(PowerShellExecutor powerShellExecutor) {
        registerExecutor("cap-powershell", powerShellExecutor);
    }

    public void registerExecutor(String capabilityId, CapabilityExecutor executor) {
        executors.put(capabilityId, executor);
        logger.info("Registered CapabilityExecutor for capability: {}", capabilityId);
    }

    public Object execute(String capabilityId, Map<String, Object> parameters) throws Exception {
        CapabilityExecutor executor = executors.get(capabilityId);
        if (executor == null) {
            throw new IllegalArgumentException("No CapabilityExecutor registered for capability: " + capabilityId);
        }
        
        logger.info("Executing capability: {}", capabilityId);
        return executor.execute(parameters);
    }
}
