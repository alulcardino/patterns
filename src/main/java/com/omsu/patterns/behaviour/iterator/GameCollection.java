package com.omsu.patterns.behaviour.iterator;

import java.util.Iterator;

public interface GameCollection {
    void addGame(Game game);
    void remove(String cat);
    int getSize();
    Iterator iterator();
}
