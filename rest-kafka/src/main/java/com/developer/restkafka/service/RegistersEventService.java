package com.developer.restkafka.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegistersEventService {

    private final KafkaTemplate<Object,Object>template;


    public <T> void addEvent(String topic, T data){
        template.send(topic,data);
    }

}
