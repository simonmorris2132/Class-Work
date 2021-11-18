package com.example.gateway.DogCEO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dogceo")
public class DogController {
    
    @GetMapping("/test")
    public String testRoute() {
        return "DogCEO";
    }
}
