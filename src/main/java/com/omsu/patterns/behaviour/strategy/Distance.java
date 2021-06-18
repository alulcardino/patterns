package com.omsu.patterns.behaviour.strategy;

public class Distance implements Strategy {
    @Override
    public double solve(Circle c1, Circle c2) {
        double dist = Math.sqrt((c1.getX() - c2.getX()) * (c1.getX() - c2.getX()) + (c1.getY() - c2.getY()) * (c1.getY() - c2.getY()));
        return dist - c1.getRadius() - c2.getRadius();
    }
}
