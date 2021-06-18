package com.omsu.patterns.structual.bridge;

public abstract class Shapes {
    protected Drawer drawer;

    protected Shapes(Drawer drawer){
        this.drawer = drawer;
    }

    public abstract void draw();

}
