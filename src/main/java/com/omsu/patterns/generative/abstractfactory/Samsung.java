package com.omsu.patterns.generative.abstractfactory;

public class Samsung implements Device{
    @Override
    public Notebook createNotebook() {
        return new SamsungNotebook();
    }

    @Override
    public SmartPhone createSmartPhone() {
        return new SamsungPhone();
    }
}
