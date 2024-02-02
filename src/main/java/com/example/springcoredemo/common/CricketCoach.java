package com.example.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component // Marks this class as a Spring bean. makes it available for dependency injection.
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor: " + this.getClass().getName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
