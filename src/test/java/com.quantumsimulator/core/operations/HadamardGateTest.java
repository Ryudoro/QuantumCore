package com.quantumsimulator.core.operations;

import com.quantumsimulator.core.util.ComplexNumber;
import com.quantumsimulator.core.qubit.QuantumState;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HadamardGateTest {

    @Test
    public void testApply() {
        HadamardGate hadamardGate = new HadamardGate();
        QuantumState state = new QuantumState(1);

        hadamardGate.apply(state, 0);

        ComplexNumber[] amplitudes = state.getAmplitudes();
        assertEquals(1 / Math.sqrt(2), amplitudes[0].getReal(), 0.001);
        assertEquals(1 / Math.sqrt(2), amplitudes[1].getReal(), 0.001);
    }
}
