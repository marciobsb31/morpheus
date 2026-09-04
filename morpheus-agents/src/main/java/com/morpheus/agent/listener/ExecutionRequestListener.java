package com.morpheus.agent.listener;

import com.morpheus.agent.model.AgentEventEnvelope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ExecutionRequestListener {

    private static final Logger logger = LoggerFactory.getLogger(ExecutionRequestListener.class);

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
                // Here we unpack inner structure. 
                // ExecutionRequest has agentId object, etc.
                Object agentIdObj = payloadMap.get("agentId");
                if (agentIdObj instanceof Map<?, ?> agentIdMap) {
                    logger.info("-> Agent ID: {}", agentIdMap.get("value"));
                }
                
                Object capabilityIdObj = payloadMap.get("capabilityId");
                if (capabilityIdObj instanceof Map<?, ?> capIdMap) {
                    logger.info("-> Capability ID: {}", capIdMap.get("value"));
                }
                
                logger.info("-> Parameters: {}", payloadMap.get("parameters"));
            }
            logger.info("Agent is processing the intent... (Mock)");
        }
        logger.info("=================================================");
    }
}
