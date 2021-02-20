package com.shipment.tracking.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * All the configuration will be kept here
 * @Author : Malli
 */
@Configuration
@ComponentScan(basePackages = {"com.shipment.tracking"})
public class AppConfig {

    @Bean
    RestTemplate restTemplate() {
       return new RestTemplate();
    }
}
