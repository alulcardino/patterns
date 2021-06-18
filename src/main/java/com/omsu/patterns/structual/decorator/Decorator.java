package com.omsu.patterns.structual.decorator;

public abstract class Decorator implements Effect {
    protected Effect effect;

    public Decorator(Effect effect) {
        this.effect = effect;
    }
    @Override
    public String nameOfEffect()
    {
        return getEffect() + effect.nameOfEffect();
    }
    public abstract String getEffect();
}
