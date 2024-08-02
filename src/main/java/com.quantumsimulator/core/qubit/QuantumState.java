package com.quantumsimulator.core.qubit;

import com.quantumsimulator.core.util.ComplexNumber;

public class QuantumState {
    private ComplexNumber[] amplitudes;

    public QuantumState(int numQubits) {
        int size = (int) Math.pow(2, numQubits);
        amplitudes = new ComplexNumber[size];
        amplitudes[0] = new ComplexNumber(1, 0); // Initial state |0⟩
        for (int i = 1; i < size; i++) {
            amplitudes[i] = new ComplexNumber(0, 0);
        }
    }

    public ComplexNumber[] getAmplitudes() {
        return amplitudes;
    }

    public void setAmplitudes(ComplexNumber[] amplitudes) {
        this.amplitudes = amplitudes;
    }
}
