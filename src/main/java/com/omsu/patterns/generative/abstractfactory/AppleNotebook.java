package com.omsu.patterns.generative.abstractfactory;

public class AppleNotebook implements Notebook{
    @Override
    public void create() {
        System.out.println("Apple notebook is created");
    }
}
