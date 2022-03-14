package com.careerdevs.nasaapi.apodcontroller;

import com.careerdevs.nasaapi.apodmodel.APODModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class APODController {
    
    @Autowired
    private Environment environment;

    @GetMapping("/apodinfo")
    public APODModel apodInfo(RestTemplate restTemplate) {
        String url = "https://api.nasa.gov/planetary/apod?api_key=" + environment.getProperty("MYAPIKEY");

        APODModel apod = restTemplate.getForObject(url, APODModel.class);

        return apod;
    }


}
