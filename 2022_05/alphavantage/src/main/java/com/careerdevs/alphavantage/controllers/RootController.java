package com.careerdevs.alphavantage.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/")
public class RootController {
  
    @Autowired
    Environment env;

    @GetMapping("/")
    public ResponseEntity<String> rootRoute() {
        //return new ResponseEntity<>("Root Route", HttpStatus.OK);
        return ResponseEntity.ok("Root Route");
    }

    @GetMapping("/apikey")
    public ResponseEntity<String> getKey() {
        return ResponseEntity.ok(env.getProperty("API_KEY"));
    }

}
