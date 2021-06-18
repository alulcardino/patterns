package com.omsu.patterns.behaviour.mediator;

public class Boeing747 extends Dispatcher {
    public Boeing747(Mediator mediator) {
        super(mediator);
    }
    @Override
    public void notify(String message) {
        System.out.println("Boeing747: " + message);
    }
}
