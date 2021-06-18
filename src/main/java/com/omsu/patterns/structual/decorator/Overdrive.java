package com.omsu.patterns.structual.decorator;

public class Overdrive extends Decorator {
    public Overdrive(Effect effect) {
        super(effect);
    }

    @Override
    public String getEffect() {
        return "Overdrive";
    }
}
