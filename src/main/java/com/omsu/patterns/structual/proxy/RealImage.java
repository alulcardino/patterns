package com.omsu.patterns.structual.proxy;

public class RealImage implements Image{
    String file;

    public RealImage(String file) {
        this.file = file;
        load();
    }

    public void load() {
        System.out.println("Load" + file);
    }

    @Override
    public void display() {
        System.out.println("Display" + file);
    }
}
