package com.careerdevs.pastebinapi.controllers;


import com.careerdevs.pastebinapi.models.PastebinapiModel;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class PastebinController {
    
    @PostMapping("/create")
    public PastebinapiModel postMethodName(RestTemplate restTemplate, @RequestBody PastebinapiModel entity) { 
        String url = "https://pastebin.com/api/api_post.php";

        HttpEntity<PastebinapiModel> request = new HttpEntity(entity);

        PastebinapiModel model = restTemplate.postForObject(url, request, PastebinapiModel.class);

        return model;
    }
    
        
}
