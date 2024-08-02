package com.quantumsimulator.core.qubit;

import com.quantumsimulator.core.util.ComplexNumber;

public abstract class Qubit {
    protected ComplexNumber[] state;

    public ComplexNumber[] getState() {
        return state;
    }

    public void setState(ComplexNumber[] newState) {
        this.state = newState;
    }

    public abstract void applyNoise();
}
