package com.omsu.patterns.behaviour.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GridGameCollection implements GameCollection {
    private List<List<Game>> grid;
    private int dim;
    private int length;

    public GridGameCollection(int dim) {
        grid = new ArrayList<>();
        grid.add(new ArrayList<>());
        this.dim = dim;
        length = 1;
    }

    @Override
    public Iterator iterator() {
        return grid.iterator();
    }

    @Override
    public void addGame(Game game) {
        if(grid.get(length - 1).size() == dim) {
            grid.add(new ArrayList<>());
            length++;
        }
        grid.get(length - 1).add(game);
    }

    @Override
    public void remove(String game) {
        for(int i = 0; i < length - 1; i++) {
            for(int j = 0; j < dim; j++) {
                if(game.equals(grid.get(i).get(j).getName())) {
                    grid.get(i).set(j, grid.get(length - 1).remove(grid.get(length - 1).size() - 1));
                    if(grid.get(length - 1).size() == 0) {
                        grid.remove(length - 1);
                        length--;
                    }
                }
            }
        }
    }

    @Override
    public int getSize() {
        return (length - 1) * dim + grid.get(length - 1).size();
    }
}