package com.example.TextProcessorAPI;

import com.example.TextProcessorAPI.validator.TextValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TextValidatorTest {

    private final TextValidator validator = new TextValidator();

    @Test
    void validateLine_validLine_noExceptionThrown() {
        String validLine = "3\\hello world";
        assertDoesNotThrow(() -> validator.validateLine(validLine));
    }

    @Test
    void validateLine_invalidLine_throwsException() {
        String invalidLine = "3 hello world";
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> validator.validateLine(invalidLine));

        assertEquals("Formato inválido: La línea no contiene el carácter '\\'", exception.getMessage());
    }

    @Test
    void validate_validInput_noExceptionThrown() {
        String validInput = "3\\hello world\n5\\another line";
        assertDoesNotThrow(() -> validator.validate(validInput));
    }

    @Test
    void validate_invalidInput_throwsException() {
        String invalidInput = "3 hello world\n5\\another line";
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> validator.validate(invalidInput));

        assertEquals("Formato inválido: La línea no contiene el carácter '\\'", exception.getMessage());
    }
}
