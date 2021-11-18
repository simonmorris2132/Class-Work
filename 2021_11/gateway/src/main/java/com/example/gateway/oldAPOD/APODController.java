package com.example.gateway.oldAPOD;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class APODController {
    
    @GetMapping("/apod") /* This gets the /apod part of the site and sets it up. It grabs resttemplate so it can GET things and taps into the APOD class to format it accordingly with the title and the url in which a video will be there, and the explanation. */
	public APOD apodInfo(RestTemplate restTemplate) {
		String URL = "https://api.nasa.gov/planetary/apod?api_key=8ffWsaa5x0qOUcPoo0FWwekN1XoPWgjLJuQa9uGJ";

		APOD apod = restTemplate.getForObject(URL, APOD.class);
		
		return apod;

	}

}
