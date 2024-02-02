package com.example.springcoredemo.config;

import com.example.springcoredemo.common.Coach;
import com.example.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic") // This method will return an object that should be registered as a bean in the Spring container
    public Coach swimCoach() { // Method name is the bean id
        return new SwimCoach();
    }

}
