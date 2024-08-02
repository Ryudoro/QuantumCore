package com.quantumsimulator.core.operations;

public class GateFactory {
    public static QuantumGate createGate(String gateType) {
        switch (gateType) {
            case "Hadamard":
                return new HadamardGate();
            case "PauliX":
                return new PauliXGate();
            default:
                throw new IllegalArgumentException("Unknown gate type: " + gateType);
        }
    }
}
