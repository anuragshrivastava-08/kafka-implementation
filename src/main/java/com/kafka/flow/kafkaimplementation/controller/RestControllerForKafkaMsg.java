package com.kafka.flow.kafkaimplementation.controller;

import com.kafka.flow.kafkaimplementation.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/api")
public class RestControllerForKafkaMsg {

    @Autowired
    Producer producer;

    @GetMapping("/producerMsg")
    public void getMessageFromClient(@RequestParam("message") String message){
        producer.sendMsgToTpoic(message);
    }
}
