package com.omsu.patterns.behaviour.visitor;

public class Grappa extends StrongAlcoholDrink{
    public Grappa() {
        alcoholPercent = 45;
        base = "Grape";
    }

    @Override
    public String accept(Visitor v) {
        return v.visit( this );
    }
}
