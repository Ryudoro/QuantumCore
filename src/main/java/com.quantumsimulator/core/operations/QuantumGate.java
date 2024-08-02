package com.quantumsimulator.core.operations;

import com.quantumsimulator.core.qubit.QuantumState;
import com.quantumsimulator.core.util.ComplexNumber;
import com.quantumsimulator.core.util.MatrixOperations;

public abstract class QuantumGate implements QuantumOperation {
    protected ComplexNumber[][] matrix;

    @Override
    public void apply(QuantumState state, int targetQubit) {
        ComplexNumber[] amplitudes = state.getAmplitudes();
        ComplexNumber[] newAmplitudes = MatrixOperations.multiply(matrix, amplitudes, targetQubit);
        state.setAmplitudes(newAmplitudes);
    }

    public abstract String getName();
}
