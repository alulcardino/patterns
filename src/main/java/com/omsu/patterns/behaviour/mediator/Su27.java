package com.omsu.patterns.behaviour.mediator;

public class Su27 extends Dispatcher {
    public Su27(Mediator mediator) {
        super(mediator);
    }
    @Override
    public void notify(String message) {
        System.out.println("Su27: " + message);
    }
}
