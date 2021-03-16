package com.example.restservice;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//http://localhost:8080/v3/api-docs
//http://localhost:8080/swagger-ui.html

@Configuration
public class ConfigureSwager {
    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI()
                .components(new Components());
    }
}
