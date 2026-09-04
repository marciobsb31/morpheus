package com.morpheus.core.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    public static final String EXCHANGE_NAME = "morpheus.exchange";
    public static final String EXECUTION_REQUEST_QUEUE = "execution.requests.queue";
    public static final String EXECUTION_REQUEST_ROUTING_KEY = "morpheus.execution.request";

    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(EXCHANGE_NAME);
    }

    @Bean
    public Queue executionRequestQueue() {
        return new Queue(EXECUTION_REQUEST_QUEUE, true);
    }

    @Bean
    public Binding bindingExecutionRequest(Queue executionRequestQueue, TopicExchange exchange) {
        return BindingBuilder.bind(executionRequestQueue).to(exchange).with(EXECUTION_REQUEST_ROUTING_KEY);
    }

    @Bean
    public MessageConverter jsonMessageConverter() {
        return new Jackson2JsonMessageConverter();
    }
}
