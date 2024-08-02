package com.quantumsimulator.core.operations;

import com.quantumsimulator.core.qubit.QuantumState;

public interface QuantumOperation {
    void apply(QuantumState state, int targetQubit);
}
