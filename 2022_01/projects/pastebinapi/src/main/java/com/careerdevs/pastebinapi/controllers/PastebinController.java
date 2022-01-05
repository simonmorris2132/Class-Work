package main.java.com.careerdevs.pastebinapi.controllers;

import org.springframework.web.bind.annotation.PostMapping;

public class PastebinController {
@PostMapping("/create")//http://localhost:4000/api/users/create
public JPUser createUser(RestTemplate restTemplate, @RequestBody JPUser userData) {
    String URL = "https://jsonplaceholder.typicode.com/users";

    HttpEntity<JPUser> request = new HttpEntity(userData);

    JPUser newUserData = restTemplate.postForObject(URL, request, JPUser.class);

    return newUserData;
}
}
