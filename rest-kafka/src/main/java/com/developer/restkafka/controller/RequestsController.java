package com.developer.restkafka.controller;

import com.developer.restkafka.data.RequestsData;
import com.developer.restkafka.service.RegistersEventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class RequestsController {
    private final RegistersEventService service;



    @PostMapping("/save-request")
    public ResponseEntity<String>saveRequest(@RequestBody RequestsData data){

        service.addEvent("SaveRequests", data);
        return ResponseEntity.status(HttpStatus.OK).body("Success");
    }
}
