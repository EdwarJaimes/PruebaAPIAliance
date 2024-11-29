package com.example.TextProcessorAPI;

import org.springframework.stereotype.Component;

@Component
public class TextValidator {

    /**
     * Valida que una línea del texto de entrada contenga el carácter `\` para separar los datos.
     *
     * @param line La línea de texto a validar.
     * @throws IllegalArgumentException Si la línea no tiene el formato esperado.
     */
    public void validateLine(String line) {
        if (!line.contains("\\")) {
            throw new IllegalArgumentException("Formato inválido: La línea no contiene el carácter '\\'");
        }
    }

    /**
     * Valida todo el texto de entrada línea por línea.
     *
     * @param inputText El texto de entrada completo.
     */
    public void validate(String inputText) {
        String[] lines = inputText.split("\n");
        for (String line : lines) {
            validateLine(line);
        }
    }
}
