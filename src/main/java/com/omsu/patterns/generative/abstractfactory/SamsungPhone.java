package com.omsu.patterns.generative.abstractfactory;

public class SamsungPhone implements SmartPhone{
    @Override
    public void create() {
        System.out.println("Samsung smartphone is created");
    }
}
