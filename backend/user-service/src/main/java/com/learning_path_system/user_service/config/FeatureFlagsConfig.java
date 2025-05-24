package com.learning_path_system.user_service.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "feature.flags")
public class FeatureFlagsConfig {
    private boolean enableNewUserRegistration = true;
    private boolean enableEmailVerification = true;
    private boolean enable2fa = false;
    private boolean enableSocialLogin = true;
    private boolean maintenanceMode = false;
    private boolean betaFeatures = false;
}
