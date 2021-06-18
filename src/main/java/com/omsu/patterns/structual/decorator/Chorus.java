package com.omsu.patterns.structual.decorator;

public class Chorus extends Decorator {
    public Chorus(Effect effect) {
        super(effect);
    }

    @Override
    public String getEffect() {
        return "Chorus";
    }
}
