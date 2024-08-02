package com.quantumsimulator.core.circuit;

import com.quantumsimulator.core.operations.QuantumGate;
import com.quantumsimulator.core.operations.QuantumOperation;
import com.quantumsimulator.core.qubit.QuantumState;
import java.util.List;

public class QuantumProcessor {
    private QuantumCircuit circuit;

    public QuantumProcessor(QuantumCircuit circuit) {
        this.circuit = circuit;
    }

    public void decomposeAndExecute() {
        // Decompose the circuit into elementary gates
        List<QuantumOperation> operations = circuit.getOperations();
        for (QuantumOperation op : operations) {
            // Decompose and apply each operation
            if (op instanceof QuantumGate) {
                ((QuantumGate) op).apply(new QuantumState(circuit.getQubits().size()), 0);
            }
        }
    }
}
