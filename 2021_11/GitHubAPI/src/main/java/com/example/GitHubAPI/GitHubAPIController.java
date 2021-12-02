package com.example.GitHubAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GitHubAPIController {
    
    @GetMapping("/allusers")
    public GitHubAPI[] gitHubAPIInfo(RestTemplate restTemplate) {
        String URL = "https://api.github.com/users";

        GitHubAPI[] gitHubAPI = restTemplate.getForObject(URL, GitHubAPI[].class);

        return gitHubAPI;
    }

    @GetMapping("/oneuser/{login}")
    public GitHubAPI gitHubInfo(RestTemplate restTemplate, @PathVariable String login) {
        String URL2 = "https://api.github.com/users/" + login;

        GitHubAPI gitHubAPI2 = restTemplate.getForObject(URL2, GitHubAPI.class);

        return gitHubAPI2;        
    }


}
