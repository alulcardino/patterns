package com.omsu.patterns.behaviour.visitor;

public abstract class StrongAlcoholDrink {
    protected double alcoholPercent;
    protected String base;

    public double getAlcoholPercent() {
        return alcoholPercent;
    }

    public String getBase() {
        return base;
    }

    public abstract String accept(Visitor v);
}
