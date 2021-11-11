package com.example.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@GetMapping("/")
	public String rootRoute() {
		return "Welcome Home!"; /* This returns Welcome Home! on the home (root) page. GetMapping is requesting the root route at "/" */
	}

	@GetMapping("/apod") /* This gets the /apod part of the site and sets it up. It grabs resttemplate so it can GET things and taps into the APOD class to format it accordingly with the title and the url in which a video will be there, and the explanation. */
	public APOD apodInfo(RestTemplate restTemplate) {
		String URL = "https://api.nasa.gov/planetary/apod?api_key=8ffWsaa5x0qOUcPoo0FWwekN1XoPWgjLJuQa9uGJ";

		APOD apod = restTemplate.getForObject(URL, APOD.class);
		
		return apod;

	}

	@GetMapping("/dogs") /* returns with dog pictures */
	public Dog dogInfo(RestTemplate restTemplate) {
		String URL = "https://dog.ceo/api/breed/hound/images";

		Dog dog = restTemplate.getForObject(URL, Dog.class);

		return dog;
	}

}
