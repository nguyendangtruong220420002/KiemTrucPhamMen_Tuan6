package com.example.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.example.product.server")
public class RestTemplateConfig {
	@Bean
	   public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
