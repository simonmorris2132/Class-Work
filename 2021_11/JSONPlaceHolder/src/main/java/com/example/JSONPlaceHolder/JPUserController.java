package com.example.JSONPlaceHolder;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("api/users")
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

    JPUser jpUsers = restTemplate.getForObject(URL2, JPUser.class);
    
    return jpUsers;
}

@PostMapping("/create")//http://localhost:4000/api/users/create
public JPUser createUser(RestTemplate restTemplate, @RequestBody JPUser userData) {
    String URL = "https://jsonplaceholder.typicode.com/users";
    
}


}
