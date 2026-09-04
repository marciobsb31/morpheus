package com.morpheus.agent.executor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class PowerShellExecutor implements CapabilityExecutor {

    private static final Logger logger = LoggerFactory.getLogger(PowerShellExecutor.class);

    @Override
    public Object execute(Map<String, Object> parameters) throws Exception {
        if (parameters == null || !parameters.containsKey("command")) {
            throw new IllegalArgumentException("PowerShellExecutor requires a 'command' parameter");
        }

        String command = parameters.get("command").toString();
        logger.info("Executing PowerShell command: {}", command);

        ProcessBuilder processBuilder = new ProcessBuilder("powershell.exe", "-Command", command);
        processBuilder.redirectErrorStream(true);

        Process process = processBuilder.start();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
            String output = reader.lines().collect(Collectors.joining(System.lineSeparator()));
            
            int exitCode = process.waitFor();
            
            if (exitCode != 0) {
                logger.error("PowerShell command failed with exit code: {}", exitCode);
                logger.error("Output: {}", output);
                throw new RuntimeException("PowerShell execution failed: " + output);
            }
            
            logger.info("PowerShell Output: {}", output);
            return output;
        }
    }
}
