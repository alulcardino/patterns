package com.omsu.patterns.behaviour.iterator;

import java.util.Iterator;
import java.util.List;

public class GridIterator implements StorageIterator {
    private List<Game> games;
    private Iterator gameCollection;
    private Iterator gameList;

    public GridIterator(GameCollection gameCollection) {
        this.gameCollection = gameCollection.iterator();
        games = (List<Game>) gameCollection.iterator().next();
        gameList = games.iterator();
    }

    @Override
    public Game next() {
        if(!gameList.hasNext()) {
            gameList = (Iterator) gameCollection.next();
            gameList = games.iterator();
        }
        return (Game) gameList.next();
    }

    @Override
    public boolean hasNext() {
        return gameList.hasNext() || gameCollection.hasNext();
    }
}
