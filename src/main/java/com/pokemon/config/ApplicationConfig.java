package com.pokemon.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

@SuppressWarnings("deprecation")

@Configuration
public class ApplicationConfig{

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
