package com.example.TextProcessorAPI;

import com.example.TextProcessorAPI.controller.TextProcessorController;
import com.example.TextProcessorAPI.model.TextOutput;
import com.example.TextProcessorAPI.service.TextProcessorService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.*;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(TextProcessorController.class)
class TextProcessorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TextProcessorService textProcessorService;

    @Test
    void shouldProcessTextSuccessfully() throws Exception {
        // Simular la respuesta esperada del servicio
        String inputText = "3\\the force is strong in this one";

        List<TextOutput> processedText = List.of(
                new TextOutput("the force is strong in this one", false),
                new TextOutput("take what you can give nothing back", true)
        );
        String expectedResponse = new ObjectMapper().writeValueAsString(processedText);

        when(textProcessorService.processText(inputText)).thenReturn(processedText);

        // Simular la solicitud HTTP POST
        mockMvc.perform(post("/api/v1/process")
                        .contentType(MediaType.TEXT_PLAIN)
                        .content(inputText))
                .andExpect(status().isOk()) // Validar código de estado
                .andExpect(content().json(expectedResponse)); // Validar contenido de la respuesta
    }

    @Test
    void shouldReturnBadRequestForInvalidInput() throws Exception {
        // Simular entrada inválida
        String invalidInput = "this is invalid input";

        when(textProcessorService.processText(invalidInput))
                .thenThrow(new IllegalArgumentException("Invalid format"));

        mockMvc.perform(post("/api/v1/process")
                        .contentType(MediaType.TEXT_PLAIN)
                        .content(invalidInput))
                .andExpect(status().isBadRequest()) // Validar código de estado
                .andExpect(content().string("Invalid format")); // Validar contenido de error
    }
}
