package com.omsu.patterns.generative.prototype;

public abstract class Building {
    private String material;
    private int height;

    public Building(Building building) {
        material = building.material;
        height = building.height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public abstract Building clone();
}
