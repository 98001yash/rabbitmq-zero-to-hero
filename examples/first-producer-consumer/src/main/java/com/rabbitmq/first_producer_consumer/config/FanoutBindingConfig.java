package com.rabbitmq.first_producer_consumer.config;


import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FanoutBindingConfig {

    @Bean
    public Binding emailBinding(
            @Qualifier("emailQueue")
            Queue emailQueue,
            FanoutExchange notificationExchange
    ) {

        return BindingBuilder
                .bind(emailQueue)
                .to(notificationExchange);
    }

    @Bean
    public Binding smsBinding(
            @Qualifier("smsQueue")
            Queue smsQueue,
            FanoutExchange notificationExchange
    ) {

        return BindingBuilder
                .bind(smsQueue)
                .to(notificationExchange);
    }

    @Bean
    public Binding analyticsBinding(
            @Qualifier("analyticsQueue")
            Queue analyticsQueue,
            FanoutExchange notificationExchange
    ) {

        return BindingBuilder
                .bind(analyticsQueue)
                .to(notificationExchange);
    }
}
