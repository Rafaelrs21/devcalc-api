package com.example.Rafael_Santiago_DR3_TP1.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {

    private final CalculatorService service = new CalculatorService();

    @Test
    public void testAdd() {
        assertEquals(15, service.add(10, 5));
    }

    @Test
    public void testSubtract() {
        assertEquals(5, service.subtract(10, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(50, service.multiply(10, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, service.divide(10, 5));
    }

    @Test
    public void testDivideByZeroThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            service.divide(10, 0);
        });
        assertEquals("Divisão por zero não permitida.", exception.getMessage());
    }
}