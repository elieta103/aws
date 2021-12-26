package com.elhg.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class GreetingController {

    @GetMapping("/aws/{name}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> greeting (@PathVariable String name){
        String message = "<i>Microservice con Spring Boot desplegado en AWS </i><br>";
        message += "<i><b>User : "+name+ "<br></b>";
        message += "Fecha : "+ new Date()+"</i>";
        return ResponseEntity.ok(message);
    }
}
