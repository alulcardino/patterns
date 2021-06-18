package com.omsu.patterns.behaviour.visitor;

public class Tequilla extends StrongAlcoholDrink {
    public Tequilla() {
        alcoholPercent = 40;
        base = "Blue agave juice";
    }

    @Override
    public String accept(Visitor v) {
        return v.visit(this);
    }
}
