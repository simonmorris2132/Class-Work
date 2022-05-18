package com.careerdevs.ghibliapi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/ghibli")
public class OverviewController {
    
    private final String BASE_URL = "https://ghibliapi.herokuapp.com/films";

    @GetMapping("/films")
    public ResponseEntity<?> filmOverview(RestTemplate restTemplate) {

        try {
            
            String url = BASE_URL;

            String responseBody = restTemplate.getForObject(url, String.class);

            return ResponseEntity.ok(responseBody);

        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }

    }

}
