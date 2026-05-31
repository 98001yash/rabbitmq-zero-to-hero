package com.rabbitmq.first_producer_consumer.config;

import org.springframework.amqp.core.FanoutExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FanoutExchangeConfig {

    public static final String NOTIFICATION_EXCHANGE =
            "notification.fanout.exchange";

    @Bean
    public FanoutExchange notificationExchange() {

        return new FanoutExchange(
                NOTIFICATION_EXCHANGE
        );
    }
}