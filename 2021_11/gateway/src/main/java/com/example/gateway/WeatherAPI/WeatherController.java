package com.example.gateway.WeatherAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherController {

	@Autowired
    private Environment environment;
    
    @GetMapping("/weather") /* Returns with weather route and displays all info from the free weather api */
	public WeatherResponse weatherInfo(RestTemplate restTemplate) {
		String URL = "http://api.openweathermap.org/data/2.5/weather?q=providence&appid=" + environment.getProperty("WEATHER_API_KEY");

		WeatherResponse weather = restTemplate.getForObject(URL, WeatherResponse.class);

		return weather;
	}

}
