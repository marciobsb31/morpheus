package com.morpheus.agent.listener;

import com.morpheus.agent.model.AgentEventEnvelope;
import com.morpheus.agent.service.AgentExecutionEngine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ExecutionRequestListener {

    private static final Logger logger = LoggerFactory.getLogger(ExecutionRequestListener.class);
    private final AgentExecutionEngine executionEngine;

    public ExecutionRequestListener(AgentExecutionEngine executionEngine) {
        this.executionEngine = executionEngine;
    }

    @RabbitListener(queues = "execution.requests.queue")
    public void receiveExecutionRequest(AgentEventEnvelope eventEnvelope) {
        logger.info("=================================================");
        logger.info("RECEIVED EVENT FROM CORE:");
        logger.info("Event ID: {}", eventEnvelope.eventId());
        logger.info("Event Type: {}", eventEnvelope.eventType());
        logger.info("Correlation ID: {}", eventEnvelope.correlationId() != null ? eventEnvelope.correlationId().get("value") : null);
        
        if ("ExecutionRequestCreated".equals(eventEnvelope.eventType())) {
            Map<String, Object> payloadMap = eventEnvelope.payload();
            logger.info("Execution Request Payload: {}", payloadMap);
            
            if (payloadMap != null) {
                String capabilityIdStr = null;
                Object capabilityIdObj = payloadMap.get("capabilityId");
                if (capabilityIdObj instanceof Map<?, ?> capIdMap) {
                    capabilityIdStr = (String) capIdMap.get("value");
                    logger.info("-> Capability ID: {}", capabilityIdStr);
                }
                
                @SuppressWarnings("unchecked")
                Map<String, Object> parameters = (Map<String, Object>) payloadMap.get("parameters");
                logger.info("-> Parameters: {}", parameters);

                if (capabilityIdStr != null) {
                    try {
                        Object result = executionEngine.execute(capabilityIdStr, parameters);
                        logger.info("Execution Result: {}", result);
                    } catch (Exception e) {
                        logger.error("Execution failed", e);
                    }
                } else {
                    logger.warn("Could not determine capabilityId from payload");
                }
            }
        }
        logger.info("=================================================");
    }
}
