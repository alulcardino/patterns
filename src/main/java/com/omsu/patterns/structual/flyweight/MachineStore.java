package com.omsu.patterns.structual.flyweight;

import java.util.ArrayList;
import java.util.List;

public class MachineStore {
    private List<Machine> guitars = new ArrayList<>();

    public void createCat(int x, int y, double rotate, int modelId, String guitar3DModel, String color, String coloring) {
        MachineModel model = Factory.getMachineModel(modelId, guitar3DModel, color, coloring);
        Machine tree = new Machine(x, y, rotate, model);
        guitars.add(tree);
    }

    public void paint() {
        for (Machine machine : guitars) {
            machine.draw();
        }
    }
}
