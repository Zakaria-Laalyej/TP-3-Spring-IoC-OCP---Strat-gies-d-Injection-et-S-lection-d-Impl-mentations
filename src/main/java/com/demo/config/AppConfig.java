package com.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.demo.dao", "com.demo.metier", "com.demo.config"})
@PropertySource("classpath:app.properties")
public class AppConfig {
    // Configuration vide pour l'instant
}