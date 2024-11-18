package com.infosys.commerceService.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

@Configuration
public class AuditorAwareConfig {

    @Bean
    public AuditorAware<String> auditorProvider() {
        // Return the current username (mocked here for simplicity)
        return () -> Optional.of("system-user"); // Replace with actual logic
    }
}
