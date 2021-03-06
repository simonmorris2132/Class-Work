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

	/* @GetMapping("/apod") 
	public APOD apodInfo(RestTemplate restTemplate) {
		String URL = "https://api.nasa.gov/planetary/apod?api_key=8ffWsaa5x0qOUcPoo0FWwekN1XoPWgjLJuQa9uGJ";

		APOD apod = restTemplate.getForObject(URL, APOD.class);
		
		return apod;

	} */

	/* @GetMapping("/weather") 
	public Weather weatherInfo(RestTemplate restTemplate) {
		String URL1 = "http://api.openweathermap.org/data/2.5/forecast?id=524901&appid=cfc27e811208976be0555ea9425aec24";

		Weather weather = restTemplate.getForObject(URL1, Weather.class);

		return weather;
	} */

}
