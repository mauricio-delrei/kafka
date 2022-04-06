package com.developer.microservicekafka.service;

import com.developer.microservicekafka.data.RequestsData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SaveRequestsService {

    @KafkaListener(topics = "SaveRequests",groupId = "MicroserviceSaveRequest")
    public void execute(ConsumerRecord<String,String>record){

    log.info("Key = {}",record.key());
    log.info("Header = {}",record.headers());
    log.info("Partition = {}",record.partition());

    String strData = record.value();

    ObjectMapper mapper = new ObjectMapper();
    RequestsData requestsData = null;

        try {
            requestsData = mapper.readValue(strData, RequestsData.class);
        } catch (JsonProcessingException ex) {
           log.error("Failed to converter event [data={}}] ", strData, ex);
        }
        
        log.info("Event Recieved = {}",requestsData);

        // todo responder para a fila que o pedido foi salvo com sucesso

    }


}
