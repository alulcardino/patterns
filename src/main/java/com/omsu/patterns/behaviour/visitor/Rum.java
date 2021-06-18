package com.omsu.patterns.behaviour.visitor;

public class Rum extends StrongAlcoholDrink {
    public Rum() {
        alcoholPercent = 50;
        base = "Molasses and cane syrup";
    }

    @Override
    public String accept(Visitor v) {
        return v.visit( this );
    }
}
