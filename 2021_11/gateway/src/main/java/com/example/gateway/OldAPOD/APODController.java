package com.example.gateway.OldAPOD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/apod")
public class APODController {
	
	@Autowired
	private Environment env;
    
    @GetMapping("/info")
	public APOD apodInfo(RestTemplate restTemplate) {
		String URL = "https://api.nasa.gov/planetary/apod?api_key=" + env.getProperty("apikey.nasa");

		APOD apod = restTemplate.getForObject(URL, APOD.class);
		
		return apod;

	}

}
