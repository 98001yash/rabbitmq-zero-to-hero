package com.rabbitmq.first_producer_consumer.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class AnalyticsConsumer {

    @RabbitListener(
            queues = "analytics.queue"
    )
    public void consumeAnalytics(
            String message
    ) {

        System.out.println(
                "ANALYTICS SERVICE : "
                        + message
        );
    }
}
