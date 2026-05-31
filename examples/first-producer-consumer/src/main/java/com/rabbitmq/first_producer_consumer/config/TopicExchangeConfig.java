package com.rabbitmq.first_producer_consumer.config;


import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicExchangeConfig {

    public static final String BUSINESS_TOPIC_EXCHANGE =
            "business.topic.exchange";

    @Bean
    public TopicExchange businessTopicExchange() {

        return new TopicExchange(
                BUSINESS_TOPIC_EXCHANGE
        );
    }
}