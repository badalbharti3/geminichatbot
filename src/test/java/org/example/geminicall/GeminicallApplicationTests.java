package org.example.geminicall;

import org.example.geminicall.service.UserService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class GeminicallApplicationTests {

    @Test
    void buildRequestIncludesPromptAndConfig() {
        UserService.GeminiGenerateRequest request = UserService.GeminiGenerateRequest.from("Hello", 0.5, 128);

        assertNotNull(request);
        assertEquals("Hello", request.contents.get(0).parts.get(0).text);
        assertEquals(0.5, request.generationConfig.temperature);
        assertEquals(128, request.generationConfig.maxOutputTokens);
    }
}
