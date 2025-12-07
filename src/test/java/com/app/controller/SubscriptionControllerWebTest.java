package com.app.controller;

import com.app.service.SubscriptionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(SubscriptionController.class)
class SubscriptionControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SubscriptionService service;

    @Test
    void testGetSummaryAPI() throws Exception {
        when(service.getSummary()).thenReturn("User ID: 9098");

        mockMvc.perform(get("/api/subscription/summary"))
                .andExpect(status().isOk())
                .andExpect(content().string("User ID: 9098"));
    }
}
