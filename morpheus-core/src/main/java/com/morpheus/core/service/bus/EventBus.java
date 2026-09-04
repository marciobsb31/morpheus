package com.morpheus.core.service.bus;

import com.morpheus.core.domain.model.EventEnvelope;

public interface EventBus {
    void publish(EventEnvelope<?> event);
}
