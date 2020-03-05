package ai.paris.weather.service.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("ai.paris.weather")
public class WeatherTriggerApplication {
	
	protected static final Logger LOGGER = LoggerFactory.getLogger(WeatherTriggerApplication.class);
	private static ApplicationContext context;
	public static void main(String[] args) {
		
		try {
			context = SpringApplication.run(WeatherTriggerApplication.class, args);
			LOGGER.info("Firing up Weather Systems");
			((ConfigurableApplicationContext) context).close();
			
		}catch(Exception e) {
			LOGGER.error("Failed to get the Weather system up & running");
		}

	}

}
