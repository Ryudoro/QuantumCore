package com.quantumsimulator.core.operations;

import com.quantumsimulator.core.util.ComplexNumber;
import com.quantumsimulator.core.operations.QuantumGate;

public class HadamardGate extends QuantumGate {
    public HadamardGate() {
        this.matrix = new ComplexNumber[][] {
            { new ComplexNumber(1/Math.sqrt(2), 0), new ComplexNumber(1/Math.sqrt(2), 0) },
            { new ComplexNumber(1/Math.sqrt(2), 0), new ComplexNumber(-1/Math.sqrt(2), 0) }
        };
    }

    @Override
    public String getName() {
        return "Hadamard";
    }
}
