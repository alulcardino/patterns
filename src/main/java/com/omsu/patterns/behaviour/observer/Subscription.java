package com.omsu.patterns.behaviour.observer;

public class Subscription implements Observer {
    private boolean pravda;
    private boolean science;
    private boolean fashion;
    private Journal journal;

    public Subscription(Journal journal) {
        this.journal = journal;
        journal.subscribeObserver(this);
    }

    @Override
    public void update(boolean pravda, boolean science, boolean fashion) {
        this.pravda = pravda;
        this.science = science;
        this.fashion = fashion;
        showSubscriptions();
    }

    public void showSubscriptions() {
        System.out.println("Subscription to Pravda: " + pravda + "\nSubscription to Nature Science: " + science + "\nSubscription to Fashion: " + fashion);
    }
}
