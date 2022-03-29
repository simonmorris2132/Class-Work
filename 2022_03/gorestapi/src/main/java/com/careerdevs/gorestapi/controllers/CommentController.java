package com.careerdevs.gorestapi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.careerdevs.gorestapi.models.CommentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/comment")
public class CommentController {
    
    @Autowired
    Environment env;

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
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteOneComment(RestTemplate restTemplate, @PathVariable("id") int commentId) {
        
        try {
            String url = "https://gorest.co.in/public/v2/comments/" + commentId;
            String token = env.getProperty("GO_REST_TOKEN");
            url += "?access-token=" + token;
            CommentModel deletedComment = restTemplate.getForObject(url, CommentModel.class);

            restTemplate.delete(url);

            return new ResponseEntity<>(deletedComment, HttpStatus.OK);

        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @PostMapping("")
    public ResponseEntity<Object> postComment(RestTemplate restTemplate, @RequestBody CommentModel newComment) {
        try {
            String url = "https://gorest.co.in/public/v2/comments/";
            String token = env.getProperty("GO_REST_TOKEN");
            url += "?access-token=" + token;

            HttpEntity<CommentModel> request = new HttpEntity<CommentModel>(newComment);

            CommentModel createdComment = restTemplate.postForObject(url, request, CommentModel.class);

            return new ResponseEntity<>(createdComment, HttpStatus.CREATED);

        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
