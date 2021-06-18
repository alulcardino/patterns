package com.omsu.patterns.generative.abstractfactory;

public interface Device {
    Notebook createNotebook();

    SmartPhone createSmartPhone();
}
