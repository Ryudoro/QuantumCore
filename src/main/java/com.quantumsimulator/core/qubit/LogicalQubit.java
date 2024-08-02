package com.quantumsimulator.core.qubit;

import java.util.List;
import com.quantumsimulator.core.operations.ErrorCorrection;

/**
 * Represents a logical qubit constructed from multiple physical qubits,
 * implementing error correction.
 */
public class LogicalQubit extends Qubit {
    private List<PhysicalQubit> physicalQubits;
    private ErrorCorrection errorCorrection;

    /**
     * Constructs a logical qubit from a list of physical qubits.
     *
     * @param physicalQubits List of physical qubits forming the logical qubit.
     * @param errorCorrection Strategy for error correction.
     */
    public LogicalQubit(List<PhysicalQubit> physicalQubits, ErrorCorrection errorCorrection) {
        this.physicalQubits = physicalQubits;
        this.errorCorrection = errorCorrection;
    }

    /**
     * Applies noise to all physical qubits and corrects errors.
     */
    @Override
    public void applyNoise() {
        for (PhysicalQubit pq : physicalQubits) {
            pq.applyNoise();
        }
        errorCorrection.correctErrors(physicalQubits);
    }

}
