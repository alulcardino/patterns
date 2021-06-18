package com.omsu.patterns.generative.abstractfactory;

public class Apple implements Device{
    @Override
    public Notebook createNotebook() {
        return new AppleNotebook();
    }

    @Override
    public SmartPhone createSmartPhone() {
        return new ApplePhone();
    }
}
