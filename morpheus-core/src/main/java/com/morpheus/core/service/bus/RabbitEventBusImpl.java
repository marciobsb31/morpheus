package com.morpheus.core.service.bus;

import com.morpheus.core.config.RabbitMQConfig;
import com.morpheus.core.domain.model.EventEnvelope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class RabbitEventBusImpl implements EventBus {
    
    private static final Logger logger = LoggerFactory.getLogger(RabbitEventBusImpl.class);
    
    private final RabbitTemplate rabbitTemplate;

    public RabbitEventBusImpl(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void publish(EventEnvelope<?> event) {
        if (event == null) throw new IllegalArgumentException("Event cannot be null");
        logger.info("Publishing event to RabbitMQ: {} ({})", event.eventType(), event.eventId());
        
        // For now, we route everything to a single queue for MVP, 
        // but normally we would use the eventType as routing key.
        String routingKey = "ExecutionRequestCreated".equals(event.eventType()) 
                ? RabbitMQConfig.EXECUTION_REQUEST_ROUTING_KEY 
                : "morpheus.events." + event.eventType().toLowerCase();
                
        rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHANGE_NAME, routingKey, event);
    }
}
