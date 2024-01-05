package blazeskills.com.example.practiseprojectforevent.Configs;

import blazeskills.com.example.practiseprojectforevent.Services.EventService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

// @Configuration
public class ApplicationConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
