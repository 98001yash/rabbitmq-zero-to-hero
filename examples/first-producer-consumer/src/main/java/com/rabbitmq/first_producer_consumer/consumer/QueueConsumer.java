package com.rabbitmq.first_producer_consumer.consumer;


import com.rabbitmq.first_producer_consumer.config.QueueConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class QueueConsumer {

    @RabbitListener(
            queues = QueueConfig.ORDERS_QUEUE
    )
    public void consumeOrderMessage(String message) {

        System.out.println(
                "Order Queue Received : " + message
        );
    }

    @RabbitListener(
            queues = QueueConfig.NOTIFICATIONS_QUEUE
    )
    public void consumeNotificationMessage(String message) {

        System.out.println(
                "Notification Queue Received : " + message
        );
    }
}