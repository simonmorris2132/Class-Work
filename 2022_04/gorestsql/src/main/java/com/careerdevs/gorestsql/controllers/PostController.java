package com.careerdevs.gorestsql.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

public class PostController {
    
    @Autowired
    Environment env;

    @PostMapping
    public ResponseEntity<Object> postComment(RestTemplate restTemplate, @RequestBody GorestModel newUser) {
        try {
            String url = "https://gorest.co.in/public/v2/comments";
            String token = env.getProperty("GO_REST_TOKEN");
            url += "?access-token=" + token;

            HttpEntity<GorestModel> request = new HttpEntity<GorestModel>(newUser);

            GorestModel newUsers = restTemplate.postForObject(url, request, GorestModel.class);

            return new ResponseEntity<>(newUsers, HttpStatus.CREATED);

        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
