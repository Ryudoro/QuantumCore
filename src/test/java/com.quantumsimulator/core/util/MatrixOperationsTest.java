package com.quantumsimulator.core.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MatrixOperationsTest {

    @Test
    public void testMultiply() {
        ComplexNumber[][] matrix = {
            {new ComplexNumber(1, 0), new ComplexNumber(0, 0)},
            {new ComplexNumber(0, 0), new ComplexNumber(1, 0)}
        };
        ComplexNumber[] vector = {
            new ComplexNumber(1, 0),
            new ComplexNumber(0, 1)
        };
        ComplexNumber[] result = MatrixOperations.multiply(matrix, vector, 0);
        assertEquals(1.0, result[0].getReal(), 0.001);
        assertEquals(0.0, result[0].getImaginary(), 0.001);
        assertEquals(0.0, result[1].getReal(), 0.001);
        assertEquals(1.0, result[1].getImaginary(), 0.001);
    }
}
