package com.app.exception;

import com.app.controller.SubscriptionController;
import com.app.service.SubscriptionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(SubscriptionController.class)
class GlobalExceptionHandlerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SubscriptionService service;

    @Test
    void testInvalidSubscriptionException() throws Exception {
        when(service.getSummary()).thenThrow(new InvalidSubscriptionDataException("Missing username"));

        mockMvc.perform(get("/api/subscription/summary"))
                .andExpect(status().isBadRequest())
                .andExpect(content().string("Validation error: Missing username"));
    }
}
