package com.johnmcmenemy.learningwebbackend.webbackend.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/sayhello")
    public String sayHelloWorld(){
        return "Hello World!";
    }

}
