package com.careerdevs.twitterapi.controllers;

import com.careerdevs.twitterapi.models.TwitterapiModel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

public class TwitterapiController {
    @GetMapping("/yeattwitter")
    public TwitterapiModel twitterInfo(RestTemplate restTemplate) {
        String url = "https://api.twitter.com/2/users/by/username/yeat1_ -H Authorization: Bearer AAAAAAAAAAAAAAAAAAAAAA5wZAEAAAAA7MhNVTOspQzQcFJzlHm97PeZWvY%3DRNQ3uIkkW2n3Rwf464oJFoMVbv3aCCeqKG";

        return null;
    }
}
