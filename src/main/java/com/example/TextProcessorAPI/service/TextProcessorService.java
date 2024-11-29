package com.example.TextProcessorAPI.service;

import com.example.TextProcessorAPI.validator.TextValidator;
import com.example.TextProcessorAPI.model.TextInput;
import com.example.TextProcessorAPI.model.TextOutput;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TextProcessorService {

    private final TextValidator textValidator;

    public TextProcessorService(TextValidator textValidator) {
        this.textValidator = textValidator;
    }

    public List<TextOutput> processText(String inputText) {

        textValidator.validate(inputText);

        List<TextOutput> results = new ArrayList<>();
        String[] lines = inputText.split("\n");

        for (String line : lines) {
            String[] parts = line.split("\\\\", 2);

            TextInput input = new TextInput(
                    Integer.parseInt(parts[0]),
                    parts[1]
            );

            String cleanPhrase = input.getPhrase().replaceAll("[^a-zA-Z\\s]", "").toLowerCase();

            boolean isWordCountCorrect = cleanPhrase.split("\\s+").length == input.getNumber();

            TextOutput output = new TextOutput(cleanPhrase, isWordCountCorrect);

            results.add(output);
        }

        return results;
    }
}
