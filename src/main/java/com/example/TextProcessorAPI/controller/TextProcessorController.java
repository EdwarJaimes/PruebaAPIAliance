package com.example.TextProcessorAPI.controller;

import com.example.TextProcessorAPI.model.TextOutput;
import com.example.TextProcessorAPI.service.TextProcessorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TextProcessorController {

    private final TextProcessorService textProcessorService;

    public TextProcessorController(TextProcessorService textProcessorService) {
        this.textProcessorService = textProcessorService;
    }

    @PostMapping("/process")
    public ResponseEntity<List<TextOutput>> processText(@RequestBody String inputText) {
        return ResponseEntity.ok(textProcessorService.processText(inputText));
    }
}


