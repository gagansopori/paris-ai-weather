package ai.paris.weather.service.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import ai.paris.weather.service.model.UserLocationResponse;


@Component
public class UserLocationService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${LocationURL}")
	private String url;		//url: http://ip-api.com/json
	
	
	protected static final Logger LOGGER = LoggerFactory.getLogger(UserLocationService.class);
	
	public UserLocationResponse findUser() {
		
		LOGGER.info("1. Finding User Location");
		return restTemplate.getForObject(url, UserLocationResponse.class);
	}

}
