package com.morpheus.agent.executor;

import org.junit.jupiter.api.Test;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PowerShellExecutorTests {

    @Test
    void shouldExecuteSimplePowerShellCommand() throws Exception {
        PowerShellExecutor executor = new PowerShellExecutor();
        
        // Use a harmless command for unit testing
        Object result = executor.execute(Map.of("command", "echo 'Hello from PowerShell'"));
        
        assertNotNull(result);
        assertTrue(result.toString().contains("Hello from PowerShell"));
    }
}
