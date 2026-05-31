package com.rabbitmq.first_producer_consumer.consumer;

import com.rabbitmq.first_producer_consumer.config.QueueConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class AutoAckConsumer {

    @RabbitListener(
            queues = QueueConfig.AUTO_ACK_QUEUE
    )
    public void consumeMessage(
            String message
    ) {

        System.out.println(
                "AUTO ACK RECEIVED : "
                        + message
        );
    }
}