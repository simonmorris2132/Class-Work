package com.example.gateway.OldAPOD;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class APODController {
    
    @GetMapping("/apod") 
	public APOD apodInfo(RestTemplate restTemplate) {
		String URL = "https://api.nasa.gov/planetary/apod?api_key=8ffWsaa5x0qOUcPoo0FWwekN1XoPWgjLJuQa9uGJ";

		APOD apod = restTemplate.getForObject(URL, APOD.class);
		
		return apod;

	}

}
