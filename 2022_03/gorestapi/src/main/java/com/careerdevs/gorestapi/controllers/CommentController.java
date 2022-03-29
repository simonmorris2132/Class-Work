package com.careerdevs.gorestapi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.careerdevs.gorestapi.models.CommentModel;

import org.apache.logging.log4j.spi.ObjectThreadContextMap;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/comment")
public class CommentController {
    
    @GetMapping("/firstpage")
    public CommentModel[] getFirstPage(RestTemplate restTemplate) {
        String url = "https://gorest.co.in/public/v2/comments";
        return restTemplate.getForObject(url, CommentModel[].class);
    }

    @GetMapping("/{id}")
    public ResponseEntity getOneComment(RestTemplate restTemplate, @PathVariable("id") int commentId) {

        try {
            String url = "https://gorest.co.in/public/v2/comments/" + commentId;
            return new ResponseEntity<>(restTemplate.getForObject(url, CommentModel.class), HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
