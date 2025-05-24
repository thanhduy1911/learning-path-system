package com.learning_path_system.user_service.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "springdoc")
public class SwaggerConfig {
    private ApiDocs apiDocs;
    private SwaggerUi swaggerUi;

    @Data
    public static class ApiDocs {
        private String path;
        private String version;
    }

    @Data
    public static class SwaggerUi {
        private String path;
        private String operationsSorter;
        private String tagsSorter;
    }
}
