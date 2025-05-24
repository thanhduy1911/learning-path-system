package com.learning_path_system.user_service.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "spring.sleuth")
public class SleuthConfig {
    private Sampler sampler;
    private Zipkin zipkin;

    @Data
    public static class Sampler {
        private double probability;
    }

    @Data
    public static class Zipkin {
        private String baseUrl;
    }
}