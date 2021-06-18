package com.omsu.patterns.behaviour.iterator;

import java.util.Iterator;

public class QueueIterator implements StorageIterator {
    private Iterator gameCollection;

    public QueueIterator(GameCollection catShelter) {
        this.gameCollection = catShelter.iterator();
    }

    @Override
    public Game next() {
        return (Game) gameCollection.next();
    }

    @Override
    public boolean hasNext() {
        return gameCollection.hasNext();
    }
}
