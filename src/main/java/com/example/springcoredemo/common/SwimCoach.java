package com.example.springcoredemo.common;

// Not using @Component annotation, we will use Java configuration
public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("In constructor: " + this.getClass().getName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }

}
