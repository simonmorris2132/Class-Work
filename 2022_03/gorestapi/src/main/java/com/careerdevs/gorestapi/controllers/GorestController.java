package com.careerdevs.gorestapi.controllers;

import com.careerdevs.gorestapi.models.GorestModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/user")
public class GorestController {
    

    @Autowired
    Environment env;

    @GetMapping("/token")
    public String getToken() {
        return env.getProperty("GO_REST_TOKEN");
    }

    @GetMapping("/firstpage")
    public Object getFirstPage(RestTemplate restTemplate) {
        
        try {
            String url = "https://gorest.co.in/public/v2/users/";

            ResponseEntity<Object> firstPage = restTemplate.getForEntity(url, Object.class);

            return firstPage;
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping("/{id}")
    public Object getOneUser(
        @PathVariable("id") String userId,
        RestTemplate restTemplate
    ) {
        try {
            String url = "https://gorest.co.in/public/v2/users/" + userId;
            String apiToken = env.getProperty("GO_REST_TOKEN");
        } catch (Exception e) {
            //TODO: handle exception
        }
    }



}
