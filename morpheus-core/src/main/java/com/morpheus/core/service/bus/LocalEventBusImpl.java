package com.morpheus.core.service.bus;

import com.morpheus.core.domain.model.EventEnvelope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentLinkedQueue;

@Deprecated
@Component
public class LocalEventBusImpl implements EventBus {
    
    private static final Logger logger = LoggerFactory.getLogger(LocalEventBusImpl.class);
    private final ConcurrentLinkedQueue<EventEnvelope<?>> eventQueue = new ConcurrentLinkedQueue<>();

    @Override
    public void publish(EventEnvelope<?> event) {
        if (event == null) throw new IllegalArgumentException("Event cannot be null");
        logger.info("Publishing event locally: {}", event.eventId());
        eventQueue.offer(event);
    }
    
    // For testing purposes
    public ConcurrentLinkedQueue<EventEnvelope<?>> getEventQueue() {
        return eventQueue;
    }
}
