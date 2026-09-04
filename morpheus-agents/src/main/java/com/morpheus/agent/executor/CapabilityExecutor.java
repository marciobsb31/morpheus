package com.morpheus.agent.executor;

import java.util.Map;

public interface CapabilityExecutor {
    Object execute(Map<String, Object> parameters) throws Exception;
}
