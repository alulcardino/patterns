package com.omsu.patterns.behaviour.iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ChainGameCollection implements GameCollection {
    private Queue<Game> queue;

    public ChainGameCollection() {
        queue = new LinkedList<>();
    }

    @Override
    public Iterator iterator() {
        return queue.iterator();
    }



    @Override
    public void addGame(Game game) {
        queue.add(game);
    }

    @Override
    public void remove(String catName) {
        for(Game game : queue) {
            if(catName.equals(game.getName())) {
                queue.remove(game);
                return;
            }
        }
    }
    @Override
    public int getSize() {
        return queue.size();
    }
}

