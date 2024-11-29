package com.example.TextProcessorAPI;

import com.example.TextProcessorAPI.model.TextOutput;
import com.example.TextProcessorAPI.service.TextProcessorService;
import com.example.TextProcessorAPI.validator.TextValidator;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TextProcessorServiceTest {

    private final TextValidator validator = new TextValidator();
    private final TextProcessorService service = new TextProcessorService(validator);

    @Test
    void processText_validInput_returnsExpectedOutput() {
        String input = "3\\the force is strong in this one\n" +
                "7\\take what you can, give nothing back";

        List<TextOutput> results = service.processText(input);

        assertEquals(2, results.size());

        TextOutput result1 = results.get(0);
        assertEquals("the force is strong in this one", result1.getCleanPhrase());
        assertFalse(result1.isWordCountCorrect());

        TextOutput result2 = results.get(1);
        assertEquals("take what you can give nothing back", result2.getCleanPhrase());
        assertTrue(result2.isWordCountCorrect());
    }

    @Test
    void processText_invalidInput_throwsException() {
        String input = "3 the force is strong in this one\n" +
                "7\\take what you can, give nothing back";

        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> service.processText(input));

        assertEquals("Formato inválido: La línea no contiene el carácter '\\'", exception.getMessage());
    }
}

