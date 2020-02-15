package org.twelveolympians.zeus.basic.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.twelveolympians.zeus.basic.message.MessageReceiver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.amqp.support.converter.ContentTypeDelegatingMessageConverter;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class RabbitMQConfig {

    public static final String QUEUE_NAME = "app-queue";
    public static final String EXCHANGE_NAME = "app-exchange";
    public static final String ROUTING_KEY = "app-route";

    @Bean
    Queue queue() {
        log.info("queue name:{}", QUEUE_NAME);
        return new Queue(QUEUE_NAME, false);
    }

    @Bean
    TopicExchange exchange() {
        log.info("exchange:{}", EXCHANGE_NAME);
        return new TopicExchange(EXCHANGE_NAME);
    }

    @Bean
    Binding binding(Queue queue, TopicExchange exchange) {
        log.info("binding {} to {} with {}", queue, exchange, ROUTING_KEY);
        return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY);
    }

    @Bean
    SimpleMessageListenerContainer simpleMessageListenerContainer(ConnectionFactory connectionFactory, MessageListenerAdapter messageListenerAdapter, Queue queue) {
        log.info("init simpleMessageListenerContainer {}", queue.getName());
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer(connectionFactory);
        container.setQueueNames(queue.getName());
        container.setMessageListener(messageListenerAdapter);
        return container;
    }

    @Bean
    MessageListenerAdapter messageListenerAdapter(MessageReceiver messageReceiver, MessageConverter messageConverter) {
        log.info("new listener");
        return new MessageListenerAdapter(messageReceiver, messageConverter);
    }

    @Bean
    public MessageConverter messageConverter() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        return new ContentTypeDelegatingMessageConverter(new Jackson2JsonMessageConverter(objectMapper));
    }

}