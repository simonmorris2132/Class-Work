package com.careerdevs.gorestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class GorestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GorestapiApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@GetMapping("/")
	public String rootRoute() {
		return "Welcome Home!"; /* This returns Welcome Home! on the home (root) page. GetMapping is requesting the root route at "/" */
	}

}
