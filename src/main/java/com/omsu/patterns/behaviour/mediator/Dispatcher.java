package com.omsu.patterns.behaviour.mediator;

public abstract class Dispatcher {
    protected Mediator mediator;
    private Point2D point2D;

    public Dispatcher(Mediator mediator) {
        this.mediator = mediator;
        this.point2D = new Point2D();
    }

    public void send(String message) {
        mediator.send(this, message);
    }

    public abstract void notify(String message);

    public Point2D getPoint2D() {
        return point2D;
    }

    public void setPoint2D(int x, int y) {
        point2D.setX(x);
        point2D.setY(y);
    }
}
