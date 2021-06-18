package com.omsu.patterns.structual.adapter;

public class Cat extends Beast implements Flyable{

    public Cat(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void canFly() {
        System.out.println("Cat can fly");
    }
}
