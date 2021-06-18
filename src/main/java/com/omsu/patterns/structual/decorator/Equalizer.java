package com.omsu.patterns.structual.decorator;

public class Equalizer extends Decorator {


    public Equalizer(Effect effect) {
        super(effect);
    }

    @Override
    public String getEffect() {
        return "Equalizer";
    }
}
