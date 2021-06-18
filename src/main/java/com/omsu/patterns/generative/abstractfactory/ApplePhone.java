package com.omsu.patterns.generative.abstractfactory;

public class ApplePhone implements SmartPhone{
    @Override
    public void create() {
        System.out.println("Apple phone is created");
    }
}
