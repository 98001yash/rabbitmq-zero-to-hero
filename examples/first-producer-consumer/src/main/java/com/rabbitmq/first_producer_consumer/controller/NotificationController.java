package com.rabbitmq.first_producer_consumer.controller;


import com.rabbitmq.first_producer_consumer.producer.QueueProducer;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class NotificationController {

    private final QueueProducer producer;

    @PostMapping("/notifications")
    public String publishNotification(
            @RequestParam String message
    ) {

        producer.publishNotification(
                message
        );

        return "Notification Published Successfully";
    }
}
