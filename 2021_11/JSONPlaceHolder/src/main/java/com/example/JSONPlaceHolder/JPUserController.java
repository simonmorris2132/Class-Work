package com.example.JSONPlaceHolder;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class JPUserController {
    
@GetMapping("/allusers")
public JPUser[] jpUserInfo(RestTemplate restTemplate) {
    String URL = "https://jsonplaceholder.typicode.com/users";

    JPUser[] jpUser = restTemplate.getForObject(URL, JPUser[].class);

    return jpUser;
}

@GetMapping("/oneuser/{id}")
public JPUser jpUserinfo2(RestTemplate restTemplate, @PathVariable short id) {
    String URL2 = "https://jsonplaceholder.typicode.com/users/" + id;
    
    System.out.println(URL2);

    JPUser jpUsers = restTemplate.getForObject(URL2, JPUser.class);
    
    return jpUsers;
}


}
