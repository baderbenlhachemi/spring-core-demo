package com.example.springcoredemo;

import org.springframework.boot.SpringApplication; // Behind the scenes, creates an application context and registers all the beans & starts the embedded server.
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication is a convenience annotation that adds all of the following:
// @Configuration: Tags the class as a source of bean definitions for the application context.
// @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.
// @ComponentScan: Tells Spring to look for other components, configurations, and services in the com/example package, letting it find the controllers.
@SpringBootApplication(
    scanBasePackages = {
        "com.example.springcoredemo",
        "com.example.util"
    }
)
public class SpringCoreDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCoreDemoApplication.class, args); // Bootstraps the application
    }

}
