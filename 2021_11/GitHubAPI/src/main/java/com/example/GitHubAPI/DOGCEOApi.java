package com.example.GitHubAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DOGCEOApi {
    
    @GetMapping("/imagesofdogs")
    public DOGCEOModel dogceoModelinfo(RestTemplate restTemplate) {
        String URL = "https://dog.ceo/api/breeds/image/random";

        DOGCEOModel dogceoModel = restTemplate.getForObject(URL, DOGCEOModel.class);

        return dogceoModel;
    }

}
