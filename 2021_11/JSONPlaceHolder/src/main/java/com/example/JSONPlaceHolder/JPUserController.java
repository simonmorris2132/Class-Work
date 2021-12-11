package com.example.JSONPlaceHolder;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpHeaders;

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

    HttpEntity<JPUser> request = new HttpEntity(userData);

    JPUser newUserData = restTemplate.postForObject(URL, request, JPUser.class);

    return newUserData;
}

@PutMapping("/update/{id}")//http://localhost:4000/api/users/update
public String updateUser(RestTemplate restTemplate, @RequestBody JPUser userData, @PathVariable short id) {
    String URL = "https://jsonplaceholder.typicode.com/users/" + id;
    
    HttpHeaders headers = new HttpHeaders();

    HttpEntity request = new HttpEntity(headers);

    restTemplate.exchange(URL, HttpMethod.PUT, request, JPUser.class);
    //ResponseEntity<JPUser> newUserData = restTemplate.exchange(URL, HttpMethod.PUT, request, JPUser.class);

    return "Updated person with ID " + id;
}

@DeleteMapping("/delete/{id}")
public String deleteUser(RestTemplate restTemplate, @PathVariable short id) {
    String URL = "https://jsonplaceholder.typicode.com/users/" + id;

    HttpHeaders headers = new HttpHeaders();

    HttpEntity request = new HttpEntity(headers);
    

    restTemplate.exchange(URL, HttpMethod.DELETE, request, JPUser.class);
    return "deleted user with the id " + id;
}


}
