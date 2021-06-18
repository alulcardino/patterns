package com.omsu.patterns.structual.adapter;

public class Beast implements Flyable {
    private String name;
    private int weight;

    public Beast(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void canFly() {
        System.out.println("Can fly");
    }
}
