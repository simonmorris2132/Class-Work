package com.careerdevs.nasaapi.apodcontroller;

import com.careerdevs.nasaapi.apodmodel.APODModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class APODController {
    
    @GetMapping("/apodinfo")
    public APODModel apodInfo(RestTemplate restTemplate) {
        String url = "https://api.nasa.gov/planetary/apod?ePb9IGWTjoa4WQlJUFbmXgrGUlId9ejemjEhYeCR";

        APODModel apod = restTemplate.getForObject(url, APODModel.class);

        return apod;
    }


}
