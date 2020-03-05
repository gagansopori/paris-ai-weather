package ai.paris.weather.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class WeatherService implements CommandLineRunner {
	
	@Autowired
	WeatherServiceImpl weatherServiceImpl;
	
	@Override
	public void run(String... args) {
		weatherServiceImpl.getCurrentWeather();
	}
	

}
