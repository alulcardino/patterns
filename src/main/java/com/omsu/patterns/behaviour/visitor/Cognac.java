package com.omsu.patterns.behaviour.visitor;

public class Cognac extends StrongAlcoholDrink {
    public Cognac() {
        alcoholPercent = 41;
        base = "Grape";
    }

    @Override
    public String accept(Visitor v) {
        return v.visit( this );
    }
}
