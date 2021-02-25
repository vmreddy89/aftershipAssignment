package com.shipment.tracking.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

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

    @Bean
    public Docket swaggerDocumentation() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.shipment.tracking")).build();
    }
}
