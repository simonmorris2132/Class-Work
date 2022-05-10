package com.careerdevs.gorestsql.controllers;

import java.util.Optional;

import com.careerdevs.gorestsql.models.User;
import com.careerdevs.gorestsql.repos.UserRepository;
import com.careerdevs.gorestsql.utils.ApiErrorHandling;
import com.careerdevs.gorestsql.utils.BasicUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

@RestController
@RequestMapping("/api/users")
public class UserController {
    
    @Autowired
    private UserRepository mainResourceRepository;

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") String id) {
        try {
            if (BasicUtils.isStrNaN(id)) {
                throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, id + " is not a valid ID");
            }

            long userId = Long.parseLong(id);
            Optional<User> foundResource = mainResourceRepository.findById(userId);

            if (foundResource.isEmpty()) {
                throw new HttpClientErrorException(HttpStatus.NOT_FOUND, " Resource Not Found With ID: " + id);
            }

            return new ResponseEntity<>(foundResource, HttpStatus.OK);

        } catch (HttpClientErrorException e) {
            return ApiErrorHandling.customApiError(e.getMessage(), e.getStatusCode());
        } catch (Exception e) {
            return ApiErrorHandling.genericApiError(e);
        }
    }



}
