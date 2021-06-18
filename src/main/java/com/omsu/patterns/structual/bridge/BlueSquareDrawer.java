package com.omsu.patterns.structual.bridge;

public class BlueSquareDrawer implements Drawer {
    public static final String color = "BLUE";


    @Override
    public void draw(int leftTopX, int leftTopY, int rightBottomX, int RightBottomY) {
        System.out.println(color + "square is done");
    }
}
