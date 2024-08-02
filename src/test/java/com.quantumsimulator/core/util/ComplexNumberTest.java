package com.quantumsimulator.core.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComplexNumberTest {

    @Test
    public void testAddition() {
        ComplexNumber a = new ComplexNumber(1.0, 2.0);
        ComplexNumber b = new ComplexNumber(3.0, 4.0);
        ComplexNumber result = a.add(b);
        assertEquals(4.0, result.getReal(), 0.001);
        assertEquals(6.0, result.getImaginary(), 0.001);
    }

    @Test
    public void testMultiplication() {
        ComplexNumber a = new ComplexNumber(1.0, 2.0);
        ComplexNumber b = new ComplexNumber(3.0, 4.0);
        ComplexNumber result = a.multiply(b);
        assertEquals(-5.0, result.getReal(), 0.001);
        assertEquals(10.0, result.getImaginary(), 0.001);
    }

    @Test
    public void testMagnitudeSquared() {
        ComplexNumber a = new ComplexNumber(3.0, 4.0);
        assertEquals(25.0, a.getMagnitudeSquared(), 0.001);
    }
}