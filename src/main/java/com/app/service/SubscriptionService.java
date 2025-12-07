package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.config.SubscriptionConfig;
import com.app.exception.InvalidSubscriptionDataException;

@Service
public class SubscriptionService {

    private final SubscriptionConfig config;

    @Autowired
    public SubscriptionService(SubscriptionConfig config) {
        this.config = config;
    }

    public String getSummary() {

        if (config.getUserId() <= 0) {
            throw new InvalidSubscriptionDataException("User ID must be positive");
        }

        StringBuilder sb = new StringBuilder();
        sb.append("User ID: ").append(config.getUserId()).append("\n");
        sb.append("User Name: ").append(config.getUserName()).append("\n");
        sb.append("Plan: ").append(config.getPlan()).append("\n");

        return sb.toString();
    }
}
