package com.omsu.patterns.behaviour.strategy;

public class SquareArea implements Strategy {
    @Override
    public double solve(Circle c1, Circle c2) {
        double sq1 = 2*c1.getRadius() / Math.sqrt(2);
        double sq2 = 2*c2.getRadius() / Math.sqrt(2);
        double fullArea = sq1*sq1 + sq2*sq2;
        double dist = Math.sqrt((c1.getX() - c2.getX()) * (c1.getX() - c2.getX()) + (c1.getY() - c2.getY()) * (c1.getY() - c2.getY()));
        if(dist >= sq1/2 + sq2/2) {
            return fullArea;
        } else if(dist <= Math.abs(sq1/2 - sq2/2)) {
            return c1.getRadius() < c2.getRadius()? sq1*sq1 : sq2*sq2;
        } else {
            return c1.getRadius() < c2.getRadius()? (sq1/2 + sq2/2 - dist)*sq1 : (sq1/2 + sq2/2 - dist)*sq2;
        }
    }
}
