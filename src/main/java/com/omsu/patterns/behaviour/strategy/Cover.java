package com.omsu.patterns.behaviour.strategy;

public class Cover implements Strategy {
    @Override
    public double solve(Circle c1, Circle c2) {
        double fullArea = c1.area() + c2.area();
        double dist = Math.sqrt((c1.getX() - c2.getX()) * (c1.getX() - c2.getX()) + (c1.getY() - c2.getY()) * (c1.getY() - c2.getY()));
        double f1, f2;
        double s1, s2;
        if(dist >= c1.getRadius() + c2.getRadius()) {
            return fullArea;
        } else if(dist <= Math.abs(c1.getRadius() - c2.getRadius())) {
            return c1.getRadius() < c2.getRadius()? c1.area() : c2.area();
        } else {
            f1 = 2 * Math.acos((c1.getRadius()*c1.getRadius() - c2.getRadius()*c2.getRadius() + dist*dist) / (2 * c1.getRadius() * dist));
            f2 = 2 * Math.acos((c2.getRadius()*c2.getRadius() - c1.getRadius()*c1.getRadius() + dist*dist) / (2 * c2.getRadius() * dist));
            s1 = (c1.getRadius()*c1.getRadius() * (f1 - Math.sin(f1))) / 2;
            s2 = (c2.getRadius()*c2.getRadius() * (f2 - Math.sin(f2))) / 2;

            return fullArea - s1 - s2;
        }
    }
}
