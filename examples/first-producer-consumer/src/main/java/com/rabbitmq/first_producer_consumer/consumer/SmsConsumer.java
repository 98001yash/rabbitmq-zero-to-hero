package com.rabbitmq.first_producer_consumer.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class SmsConsumer {

    @RabbitListener(
            queues = "sms.queue"
    )
    public void consumeSms(
            String message
    ) {

        System.out.println(
                "SMS SERVICE : "
                        + message
        );
    }
}