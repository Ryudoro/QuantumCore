package com.quantumsimulator.core.operations;

import java.util.List;
import com.quantumsimulator.core.qubit.PhysicalQubit;

public interface ErrorCorrection {
    void correctErrors(List<PhysicalQubit> physicalQubits);
}
