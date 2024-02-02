package com.example.springcoredemo.rest;

import com.example.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach; // Define a private field for the dependency

    @Autowired // Tells Spring to inject the dependency. If we have one constructor, we can omit @Autowired
    public DemoController(@Qualifier("baseballCoach") Coach coach) { // Constructor injection, use it when we have required dependencies
        this.myCoach = coach;
    }

//    @Autowired
//    public void setCoach(Coach myCoach) { // Setter injection, use it when we have optional dependencies
//        this.myCoach = myCoach;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
