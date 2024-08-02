package com.quantumsimulator.core.operations;

import com.quantumsimulator.core.util.ComplexNumber;
import com.quantumsimulator.core.qubit.QuantumState;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PauliXGateTest {

    @Test
    public void testApply() {
        PauliXGate pauliXGate = new PauliXGate();
        QuantumState state = new QuantumState(1);

        pauliXGate.apply(state, 0);

        ComplexNumber[] amplitudes = state.getAmplitudes();
        assertEquals(0.0, amplitudes[0].getReal(), 0.001);
        assertEquals(1.0, amplitudes[1].getReal(), 0.001);
    }
}
