package com.kafka.flow.kafkaimplementation.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "kafka_impl_msg", groupId = "kafka_impl_group")
    public void listenToTopic(String receivedMsg){
        System.out.println("Received message=" + receivedMsg);
    }
}
