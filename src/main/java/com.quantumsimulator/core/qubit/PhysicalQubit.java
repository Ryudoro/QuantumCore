package com.quantumsimulator.core.qubit;

import com.quantumsimulator.core.util.ComplexNumber;
import com.quantumsimulator.core.operations.NoiseModel;

public class PhysicalQubit extends Qubit {
    private NoiseModel noiseModel;

    public PhysicalQubit() {
        this.state = new ComplexNumber[] {
            new ComplexNumber(1, 0), // |0⟩
            new ComplexNumber(0, 0)  // |1⟩
        };
        this.noiseModel = new NoiseModel();
    }

    @Override
    public void applyNoise() {
        this.state = noiseModel.apply(this.state);
    }
}
