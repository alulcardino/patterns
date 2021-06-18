package com.omsu.patterns.structual.decorator;

public class Signal implements Effect {

    @Override
    public String nameOfEffect() {
        return "Signal affected with:";
    }
}
