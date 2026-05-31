package com.rabbitmq.first_producer_consumer.consumer;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class EmailConsumer {

    @RabbitListener(
            queues = "email.queue"
    )
    public void consumeEmail(
            String message
    ) {

        System.out.println(
                "EMAIL SERVICE : "
                        + message
        );
    }
}
