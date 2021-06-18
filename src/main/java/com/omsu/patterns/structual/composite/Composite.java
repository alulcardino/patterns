package com.omsu.patterns.structual.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Shape{
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    @Override
    public void draw() {
        for (Shape shape: shapes) {
            shape.draw();
        }
    }
}
