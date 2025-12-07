package com.app.config;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

class SubscriptionConfigTest {

    private final ApplicationContextRunner ctxRunner =
            new ApplicationContextRunner()
                    .withPropertyValues(
                            "subscription.user-id=9098",
                            "subscription.user-name=Bob Turner",
                            "subscription.plan=Premium UHD"
                    )
                    .withUserConfiguration(Config.class);

    @EnableConfigurationProperties(SubscriptionConfig.class)
    static class Config {}

    @Test
    void testPropertiesBinding() {
        ctxRunner.run(context -> {
            SubscriptionConfig props = context.getBean(SubscriptionConfig.class);

            assertEquals(9098, props.getUserId());
            assertEquals("Bob Turner", props.getUserName());
            assertEquals("Premium UHD", props.getPlan());
        });
    }
}
