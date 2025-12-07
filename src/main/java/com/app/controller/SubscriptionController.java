package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.SubscriptionService;

@RestController
@RequestMapping("/api/subscription")
public class SubscriptionController {
	private final SubscriptionService service;

    @Autowired
    public SubscriptionController(SubscriptionService service) {
        this.service = service;
    }

    @GetMapping("/summary")
    public String getSummary() {
        return service.getSummary();
    }
}
