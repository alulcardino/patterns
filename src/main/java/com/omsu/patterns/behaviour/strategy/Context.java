package com.omsu.patterns.behaviour.strategy;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public double solve(Circle c1, Circle c2) {
        return strategy.solve(c1, c2);
    }
}
