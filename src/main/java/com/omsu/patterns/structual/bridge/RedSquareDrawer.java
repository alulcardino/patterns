package com.omsu.patterns.structual.bridge;

public class RedSquareDrawer implements Drawer {
    public static final String color = "RED";


    @Override
    public void draw(int leftTopX, int leftTopY, int rightBottomX, int RightBottomY) {
        System.out.println(color + "square is done");
    }
}
