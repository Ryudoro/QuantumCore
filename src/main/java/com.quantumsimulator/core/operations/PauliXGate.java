package com.quantumsimulator.core.operations;

import com.quantumsimulator.core.util.ComplexNumber;

public class PauliXGate extends QuantumGate {
    public PauliXGate() {
        this.matrix = new ComplexNumber[][] {
            { new ComplexNumber(0, 0), new ComplexNumber(1, 0) },
            { new ComplexNumber(1, 0), new ComplexNumber(0, 0) }
        };
    }

    @Override
    public String getName() {
        return "Pauli-X";
    }
}
