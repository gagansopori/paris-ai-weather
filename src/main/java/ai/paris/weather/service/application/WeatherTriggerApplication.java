package ai.paris.weather.service.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@ComponentScan("ai.paris.weather")
public class WeatherTriggerApplication {
	
	protected static final Logger LOGGER = LoggerFactory.getLogger(WeatherTriggerApplication.class);
	private static ApplicationContext context;
	public static void main(String[] args) {
		
		try {
			LOGGER.info("Hello World!! This is the Start of PARIS Weather Service.");
			context = SpringApplication.run(WeatherTriggerApplication.class, args);
//			((ConfigurableApplicationContext) context).close();
			
		}catch(Exception e) {
			LOGGER.error("Uh-Oh! PARIS faced an exception starting up!");
		}

	}

}
