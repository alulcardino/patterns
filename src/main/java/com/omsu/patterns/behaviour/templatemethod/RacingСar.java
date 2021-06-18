package com.omsu.patterns.behaviour.templatemethod;

public class RacingСar extends Car{
    @Override
    protected void createFrame() {
        System.out.println("yes");
    }

    @Override
    protected void addWheel() {
        System.out.println("yes");

    }

    @Override
    protected void addTransmission() {
        System.out.println("yes");

    }

    @Override
    protected void addWeapon() {
        System.out.println("no");

    }

    @Override
    protected void addTrack() {
        System.out.println("no");

    }

    @Override
    protected void addBrakes() {
        System.out.println("yes");

    }
}
