package com.omsu.patterns.structual.flyweight;

import java.util.Objects;

public class Machine {
    private int x;
    private int y;
    private double rotate;
    private MachineModel model;

    public Machine(int x, int y, double rotate, MachineModel model) {
        this.x = x;
        this.y = y;
        this.rotate = rotate;
        this.model = model;
    }

    public void draw() {
        System.out.println("(x,y) = (" + x + "," + y + "), rotate = " + rotate + ", " + model.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Machine guitar = (Machine) o;
        return x == guitar.x &&
                y == guitar.y &&
                Double.compare(guitar.rotate, rotate) == 0 &&
                Objects.equals(model, guitar.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, rotate, model);
    }
}
