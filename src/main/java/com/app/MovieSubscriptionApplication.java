package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.config.SubscriptionConfig;

@SpringBootApplication
public class MovieSubscriptionApplication implements CommandLineRunner {

    @Autowired
    private SubscriptionConfig props;

    public static void main(String[] args) {
        SpringApplication.run(MovieSubscriptionApplication.class, args);
    }

    @Override
    public void run(String... args) {

        System.out.println("\n===== SUBSCRIPTION DETAILS =====");
        System.out.println("User ID    : " + props.getUserId());
        System.out.println("User Name  : " + props.getUserName());
        System.out.println("Plan       : " + props.getPlan());
        System.out.println("Watch Time : " + props.getWatchTimeHours());
        System.out.println("Genres     : " + props.getGenresPreferred());
        System.out.println("Devices    : " + props.getActiveDevices());
        System.out.println("Ratings    : " + props.getRatings());
        System.out.println("Last Movie : " + props.getLastWatched().getMovie());
        System.out.println("Duration   : " + props.getLastWatched().getDuration());
    }
}
