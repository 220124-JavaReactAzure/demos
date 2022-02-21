package com.revature;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BerryConfig {
    @Bean
    public Berry berry() {
        return new Berry("oran", "healing");
    }
}
