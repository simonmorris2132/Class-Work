package com.example.gateway.Weather;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherController {
    
    @GetMapping("/weather") /* Returns with weather route and displays all info from the free weather api */
	public WeatherResponse weatherInfo(RestTemplate restTemplate) {
		String URL = "http://api.openweathermap.org/data/2.5/weather?q=providence&appid=cfc27e811208976be0555ea9425aec24";

		WeatherResponse weather = restTemplate.getForObject(URL, WeatherResponse.class);

		return weather;
	}

}
