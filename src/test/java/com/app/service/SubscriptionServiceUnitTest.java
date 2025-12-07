package com.app.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.app.config.SubscriptionConfig;
import com.app.exception.InvalidSubscriptionDataException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SubscriptionServiceTest {

    private SubscriptionService service;
    private SubscriptionConfig config;

    @BeforeEach
    void setup() {
        config = mock(SubscriptionConfig.class);
        service = new SubscriptionService(config);
    }

    @Test
    void testGetSummarySuccess() {
        when(config.getUserId()).thenReturn(9098);
        when(config.getUserName()).thenReturn("Bob Turner");
        when(config.getPlan()).thenReturn("Premium UHD");

        String summary = service.getSummary();

        assertTrue(summary.contains("9098"));
        assertTrue(summary.contains("Bob Turner"));
        assertTrue(summary.contains("Premium UHD"));
    }

    @Test
    void testGetSummaryShouldThrowExceptionForInvalidData() {
        when(config.getUserName()).thenReturn(null);

        assertThrows(InvalidSubscriptionDataException.class, () -> service.getSummary());
    }
}
