package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.lang.String;

@RestController
@RequestMapping("/weather")
public class WeatherController {
	
@Autowired(required=false)

@GetMapping("/temperature/{city}")

public ResponseEntity<String> getTemperature(@PathVariable String city) {
RestTemplate restTemplate = new RestTemplate();
String url = "https://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=aec4fddcfa6693bcbd2c4293f629fe55";
WeatherResponse weatherResponse = restTemplate.getForObject(url, WeatherResponse.class);
if (weatherResponse != null) {
double temperature = weatherResponse.getMain().getTemp();
return ResponseEntity.ok("Temperature: " + temperature + "°C");
} else {
return ResponseEntity.badRequest().body("Failed to fetch weather data.");
}
}
}
