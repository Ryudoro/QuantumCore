package com.quantumsimulator.core.circuit;

import com.quantumsimulator.core.qubit.*;
import com.quantumsimulator.core.operations.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a quantum circuit that can operate on both physical and logical qubits.
 */
public class QuantumCircuit {
    private List<Qubit> qubits;
    private List<QuantumOperation> operations;

    /**
     * Constructs a quantum circuit with the specified number of qubits.
     *
     * @param numQubits Number of qubits in the circuit.
     * @param useLogicalQubits Flag indicating whether to use logical qubits.
     */
    public QuantumCircuit(int numQubits, boolean useLogicalQubits) {
        this.qubits = new ArrayList<>();
        this.operations = new ArrayList<>();
        for (int i = 0; i < numQubits; i++) {
            if (useLogicalQubits) {
                // Create logical qubits with error correction
                List<PhysicalQubit> physicalQubits = new ArrayList<>();
                for (int j = 0; j < 3; j++) {  // Example: Logical qubit composed of 3 physical qubits
                    physicalQubits.add(new PhysicalQubit());
                }
                qubits.add(new LogicalQubit(physicalQubits, new ConcreteErrorCorrection()));
            } else {
                qubits.add(new PhysicalQubit());
            }
        }
    }

    public void addQubit(Qubit qubit) {
        qubits.add(qubit);
    }

    public void addOperation(QuantumOperation operation, int targetQubit) {
        operations.add(operation);
        operation.apply(new QuantumState(qubits.size()), targetQubit);
    }

    public List<Qubit> getQubits() {
        return qubits;
    }

    public List<QuantumOperation> getOperations() {
        return operations;
    }

    public void execute() {
        QuantumState state = new QuantumState(qubits.size());
        for (QuantumOperation operation : operations) {
            for (int i = 0; i < qubits.size(); i++) {
                operation.apply(state, i);
            }
        }
    }
}

