package com.omsu.patterns.generative.abstractfactory;

public class SamsungNotebook implements Notebook{
    @Override
    public void create() {
        System.out.println("Samsung notebook is created");
    }
}
