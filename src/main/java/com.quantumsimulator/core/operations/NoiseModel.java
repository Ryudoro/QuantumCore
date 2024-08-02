package com.quantumsimulator.core.operations;

import com.quantumsimulator.core.util.ComplexNumber;
import com.quantumsimulator.core.util.RandomUtils;

public class NoiseModel {
    private static final double ERROR_RATE = 0.01;

    public ComplexNumber[] apply(ComplexNumber[] state) {
        if (RandomUtils.random() < ERROR_RATE) {
            // Introduce noise (e.g., simple bit flip)
            return new ComplexNumber[] { state[1], state[0] };
        }
        return state;
    }
}
