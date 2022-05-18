package com.careerdevs.ghibliapi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
    
    @GetMapping("/")
    public ResponseEntity<String> rootRoute() {
        return ResponseEntity.ok("Hello Ghibli Fans!");
    }

}
