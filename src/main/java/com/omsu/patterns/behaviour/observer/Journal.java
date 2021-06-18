package com.omsu.patterns.behaviour.observer;

import java.util.LinkedList;
import java.util.List;

public class Journal implements Observable {
    private List<Observer> subscribers;
    private boolean Pravda;
    private boolean Science;
    private boolean Fashion;

    public Journal() {
        this.subscribers = new LinkedList<>();
    }

    public void setPravda(boolean pravda) {
        Pravda = pravda;
    }

    public void setScience(boolean science) {
        Science = science;
    }

    public void setFashion(boolean fashion) {
        Fashion = fashion;
    }

    @Override
    public void subscribeObserver(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void unsubscribeObserver(Observer o) {
        subscribers.remove(o);
    }


    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.update(Pravda, Science, Fashion);
        }
    }
}
