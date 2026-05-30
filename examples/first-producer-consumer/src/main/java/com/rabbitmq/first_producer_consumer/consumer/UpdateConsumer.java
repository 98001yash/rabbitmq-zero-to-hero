package com.rabbitmq.first_producer_consumer.consumer;

import com.rabbitmq.first_producer_consumer.config.QueueConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class UpdateConsumer {

    @RabbitListener(
            queues = QueueConfig.UPDATES_QUEUE
    )
    public void consumeUpdateMessage(
            String message
    ) {

        System.out.println(
                "UPDATE EVENT : " + message
        );
    }
}