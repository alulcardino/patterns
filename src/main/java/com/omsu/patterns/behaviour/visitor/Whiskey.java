package com.omsu.patterns.behaviour.visitor;

public class Whiskey extends StrongAlcoholDrink {
    public Whiskey() {
        alcoholPercent = 42;
        base = "Corn";
    }

    @Override
    public String accept(Visitor v) {
        return v.visit( this );
    }
}
