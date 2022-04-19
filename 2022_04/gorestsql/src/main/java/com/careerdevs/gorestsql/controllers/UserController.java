package com.careerdevs.gorestsql.controllers;

import com.careerdevs.gorestsql.models.User;
import com.careerdevs.gorestsql.repos.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/user")
public class UserController {
    
    @Autowired
    Environment env;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/token")
    public String getToken() {
        return env.getProperty("GO_REST_TOKEN");
    }

    @GetMapping("/firstpage")
    public Object getFirstPage(RestTemplate restTemplate) {
        
        try {
            String url = "https://gorest.co.in/public/v2/users/";

            ResponseEntity<User[]> firstPage = restTemplate.getForEntity(url, User[].class);

            User[] firstPageUsers = firstPage.getBody();

            for (int i = 0; i < firstPageUsers.length; i++) {
                User tempUser = firstPageUsers[i];

                System.out.println(tempUser.generateReport());
            }
            
            return firstPage;

        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping("/{id}")
    public ResponseEntity getOneUser(RestTemplate restTemplate, @PathVariable("id") int userId) {

        try {
            String url = "https://gorest.co.in/public/v2/comments/" + userId;
            return new ResponseEntity<>(restTemplate.getForObject(url, User.class), HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteOneUser(RestTemplate restTemplate, @PathVariable("id") int userId) {
        
        try {
            String url = "https://gorest.co.in/public/v2/comments/" + userId;
            String token = env.getProperty("GO_REST_TOKEN");
            url += "?access-token=" + token;
            User deletedUser = restTemplate.getForObject(url, User.class);

            restTemplate.delete(url);

            return new ResponseEntity<>(deletedUser, HttpStatus.OK);

        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    
    @PostMapping("/add")
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {
        User n = new User();
        n.setName(name);
        n.setEmail(email);
        userRepository.save(n);
        return "Saved";
    }

    @PutMapping
    public ResponseEntity<Object> putComment(RestTemplate restTemplate, @RequestBody User updateUser) {
        try {
            String url = "https://gorest.co.in/public/v2/comments/" + updateUser.getId();
            String token = env.getProperty("GO_REST_TOKEN");
            url += "?access-token=" + token;

            HttpEntity<User> request = new HttpEntity<User>(updateUser);

            ResponseEntity<User> response = restTemplate.exchange(url, HttpMethod.PUT, request, User.class);
            return new ResponseEntity<>(response.getBody(), HttpStatus.OK);

        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}

