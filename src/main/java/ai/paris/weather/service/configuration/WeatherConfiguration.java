package ai.paris.weather.service.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class WeatherConfiguration {
	
	protected static final Logger LOGGER = LoggerFactory.getLogger(WeatherConfiguration.class);
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		LOGGER.info("Rest Template Initialized");
		return builder.build();
	}
	
}
