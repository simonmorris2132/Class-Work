package com.example.JSONPlaceHolder.API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class JsonPlaceHolderController {
     
    @GetMapping("/api/db")
    public JSONPlaceHolderStuff JsonDB(RestTemplate restTemplate) {
        String URL = "https://github.com/simonmorris2132/JsonPlaceHolder/blob/master/db.json";

        JSONPlaceHolderStuff jsonPlaceHolderStuff = restTemplate.getForObject(URL, JSONPlaceHolderStuff.class);

        return jsonPlaceHolderStuff;

    }

    @GetMapping("/api/db/posts/1")
    public JSONPlaceHolderStuff JsonPost1(RestTemplate restTemplate) {
        String URL2 = "http://my-json-server.typicode.com/simonmorris2132/JsonPlaceHolder/posts/1";

        JSONPlaceHolderStuff jStuff1 = restTemplate.getForObject(URL2, JSONPlaceHolderStuff.class);

        return jStuff1;

    }

}
