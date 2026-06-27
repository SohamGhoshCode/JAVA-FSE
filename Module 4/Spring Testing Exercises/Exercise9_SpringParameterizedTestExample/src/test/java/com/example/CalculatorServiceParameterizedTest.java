package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceParameterizedTest {

    private CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @CsvSource({
        "1, 2, 3",
        "5, 5, 10",
        "0, 0, 0",
        "10, 20, 30"
    })
    public void testAdd(int a, int b, int expected) {
        assertEquals(expected, calculatorService.add(a, b));
    }
}
