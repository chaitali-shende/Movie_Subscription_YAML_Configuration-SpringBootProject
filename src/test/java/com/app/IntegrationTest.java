package com.app;

import static org.junit.jupiter.api.Assertions.*;

import com.app.service.SubscriptionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IntegrationTest {

    @Autowired
    private SubscriptionService service;

    @Test
    void contextLoads_andServiceWorks() {
        assertNotNull(service);
        String s = service.getSummary();
        assertTrue(s.contains("User Name"));
    }
}
