package com.learning_path_system.user_service.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "eureka")
public class EurekaConfig {
    private Client client;
    private Instance instance;

    @Data
    public static class Client {
        private ServiceUrl serviceUrl;
    }

    @Data
    public static class ServiceUrl {
        private String defaultZone;
    }

    @Data
    public static class Instance {
        private boolean preferIpAddress;
    }
}
