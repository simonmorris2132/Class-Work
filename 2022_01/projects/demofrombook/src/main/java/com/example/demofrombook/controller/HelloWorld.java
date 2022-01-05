package com.example.demofrombook.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    
    @GetMapping("/sayhello")
    public String sayHelloWorld() {
        return "Hello World!";
    }

}
