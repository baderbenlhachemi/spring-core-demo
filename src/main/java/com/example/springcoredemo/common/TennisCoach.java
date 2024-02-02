package com.example.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy // Tells Spring to create a bean only when it is requested
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("In constructor: " + this.getClass().getName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
