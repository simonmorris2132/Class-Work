package com.example.gateway.OldAPOD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@RequestMapping
public class APODController {
    
    @Autowired
    private Environment environment;

    @GetMapping("/apodinfo")
    public APOD apodInfo (RestTemplate restTemplate) {
        String URL = "https://api.nasa.gov/planetary/apod?api_key=" + environment.getProperty("MY_KEY");

        APOD apod = restTemplate.getForObject(URL, APOD.class);

        return apod;
    }


}
