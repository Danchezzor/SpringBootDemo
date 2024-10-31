package com.example.demo.javaConfig;

import com.example.demo.profile.DevProfile;
import com.example.demo.profile.ProductionProfile;
import com.example.demo.profile.SystemProfile;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
