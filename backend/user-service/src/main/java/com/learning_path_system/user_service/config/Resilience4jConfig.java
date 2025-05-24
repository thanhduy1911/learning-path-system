package com.learning_path_system.user_service.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Data
@Configuration
@ConfigurationProperties(prefix = "resilience4j")
public class Resilience4jConfig {
    private CircuitBreakerConfig circuitbreaker;
    private RetryConfig retry;
    private RateLimiterConfig ratelimiter;

    @Data
    public static class CircuitBreakerConfig {
        private Map<String, InstanceConfig> instances;
    }

    @Data
    public static class RetryConfig {
        private Map<String, InstanceConfig> instances;
    }

    @Data
    public static class RateLimiterConfig {
        private Map<String, InstanceConfig> instances;
    }

    @Data
    public static class InstanceConfig {
        private int slidingWindowSize;
        private int failureRateThreshold;
        private int waitDurationInOpenState;
        private int permittedNumberOfCallsInHalfOpenState;
        private int maxAttempts;
        private int waitDuration;
        private int limitForPeriod;
        private String limitRefreshPeriod;
    }
}
