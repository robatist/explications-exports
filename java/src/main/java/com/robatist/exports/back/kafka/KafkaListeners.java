package com.robatist.exports.back.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "${spring.kafka.consumer.explicationsTopic.name}", groupId = "${spring.kafka.consumer.group-id}")
    void listener(String message) {
        System.out.println("Received message: " + message);
    }

}
