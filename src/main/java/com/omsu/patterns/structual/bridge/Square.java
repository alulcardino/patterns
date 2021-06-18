package com.omsu.patterns.structual.bridge;

public class Square extends Shapes{
    private int leftTopX;
    private int leftTopY;
    private int rightBottomX;
    private int rightBottomY;

    public Square(Drawer drawer, int leftTopX, int leftTopY, int rightBottomX, int rightBottomY) {
        super(drawer);
        this.leftTopX = leftTopX;
        this.leftTopY = leftTopY;
        this.rightBottomX = rightBottomX;
        this.rightBottomY = rightBottomY;
    }

    @Override
    public void draw() {
        drawer.draw(leftTopX, leftTopY, rightBottomX, rightBottomX);
    }

    public int getLeftTopX() {
        return leftTopX;
    }

    public void setLeftTopX(int leftTopX) {
        this.leftTopX = leftTopX;
    }

    public int getLeftTopY() {
        return leftTopY;
    }

    public void setLeftTopY(int leftTopY) {
        this.leftTopY = leftTopY;
    }

    public int getRightBottomX() {
        return rightBottomX;
    }

    public void setRightBottomX(int rightBottomX) {
        this.rightBottomX = rightBottomX;
    }

    public int getRightBottomY() {
        return rightBottomY;
    }

    public void setRightBottomY(int rightBottomY) {
        this.rightBottomY = rightBottomY;
    }
}
