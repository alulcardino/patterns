package com.omsu.patterns.behaviour.mediator;

public interface Mediator {
    void send(Dispatcher dispatcher, String message);
}
