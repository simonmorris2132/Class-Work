package com.example.JSONPlaceHolder;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class JPUserController {
    
@GetMapping("/api/db/1")
public JPUser jpUserInfo(RestTemplate restTemplate) {
    String URL = "https://jsonplaceholder.typicode.com/users/1";

    JPUser jpUser = restTemplate.getForObject(URL, JPUser.class);

    return jpUser;
}


}
