package ai.paris.weather.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import ai.paris.location.service.service.UserLocationServiceImpl;
import ai.paris.weather.service.model.CurrentWeatherResponseModel;

@Component
public class WeatherServiceImpl {
	
	String ipAddress;
	
//	@Autowired
//	private UserLocationServiceImpl userLocation;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private CurrentWeatherResponseModel weatherResponse;
	
	public void getCurrentWeather() {
		
		UserLocationServiceImpl userLocation = new UserLocationServiceImpl();
		ipAddress = userLocation.findUser().getQuery();
		System.out.println(ipAddress);
	}

}
