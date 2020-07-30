package ai.paris.weather.service.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import ai.paris.current.weather.service.model.CurrentWeatherResponseModel;
import ai.paris.weather.service.model.UserLocationResponse;

@Component
public class WeatherService implements CommandLineRunner {
	
	String ipAddress;
	
	@Autowired
	private UserLocationService userLocation;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${CurrentWeatherURL}")
	private String currentWeatherURL; 	//url: https://api.openweathermap.org/data/2.5/weather?lat=<lat>&lon=<lon>&appid=<your-api-token>
	
	@Value("${OpenWeatherMapAPIKey}")
	private String weatherApiKey;
	
	private static Logger LOGGER = LoggerFactory.getLogger(WeatherService.class);
	
	public void getCurrentWeather() {

		LOGGER.info("PARIS Weather Service is now up & running.");
		
		UserLocationResponse userLocResponse = userLocation.findUser();		
		LOGGER.info("2. Acquired User Location. Initializing Weather Service Parameters.");
		
		try {
			LOGGER.info("3. Building URI for Weather Service");
			UriComponents uriComponents = UriComponentsBuilder.newInstance()
					.scheme("https").host(currentWeatherURL)
						.queryParam("lat", userLocResponse.getLat())
						.queryParam("lon", userLocResponse.getLon())
						.queryParam("appid", weatherApiKey).build();
						
			LOGGER.info("4. Getting Weather Data from OpenWeatherMaps");
			HttpEntity<String> request = new HttpEntity<>("");
			ResponseEntity<CurrentWeatherResponseModel> response = restTemplate.exchange(uriComponents.toUriString(),HttpMethod.GET, request, CurrentWeatherResponseModel.class);
			CurrentWeatherResponseModel currentWeather = new CurrentWeatherResponseModel();
			currentWeather = response.getBody();
			System.out.println(currentWeather.toString());
		} catch (Exception e) {
			LOGGER.error("Caught Exception building the URL");
		}
		
		
	}

	
	@Override
	public void run(String... args) {
		getCurrentWeather();
	}
	

}
