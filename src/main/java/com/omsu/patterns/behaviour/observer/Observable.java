package com.omsu.patterns.behaviour.observer;

public interface Observable {
    void subscribeObserver(Observer o);
    void unsubscribeObserver(Observer o);
    void notifyObservers();
}
