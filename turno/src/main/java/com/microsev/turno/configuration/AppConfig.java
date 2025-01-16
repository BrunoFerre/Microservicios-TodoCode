package com.microsev.turno.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
    @Bean("apiConsumir")
    public RestTemplate registrarTemplate(){
        return new RestTemplate();
    }
}
