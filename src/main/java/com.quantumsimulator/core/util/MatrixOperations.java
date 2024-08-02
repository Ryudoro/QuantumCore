package com.quantumsimulator.core.util;

import com.quantumsimulator.core.util.ComplexNumber;

public class MatrixOperations {
    public static ComplexNumber[] multiply(ComplexNumber[][] matrix, ComplexNumber[] vector, int targetQubit) {
        int size = vector.length;
        ComplexNumber[] result = new ComplexNumber[size];
        for (int i = 0; i < size; i++) {
            result[i] = new ComplexNumber(0, 0);
            for (int j = 0; j < size; j++) {
                result[i] = result[i].add(matrix[i][j].multiply(vector[j]));
            }
        }
        return result;
    }
}
