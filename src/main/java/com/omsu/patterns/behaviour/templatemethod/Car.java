package com.omsu.patterns.behaviour.templatemethod;

public abstract class Car {
    protected abstract void createFrame();
    protected abstract void addWheel();
    protected abstract void addTransmission();
    protected abstract void addWeapon();
    protected abstract void addTrack();
    protected abstract void addBrakes();

    public final void assembly() {
        createFrame();
        addTransmission();
        addBrakes();
        addWheel();
        addTrack();
        addWeapon();
    }
}
