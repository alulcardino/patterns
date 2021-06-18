package com.omsu.patterns.structual.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    static Map<Integer, MachineModel> guitarModels = new HashMap<>();

    public static MachineModel getMachineModel(int modelId, String machine3DModel, String color, String coloring) {
        MachineModel result = guitarModels.get(modelId);
        if (result == null) {
            result = new MachineModel(modelId, machine3DModel, color, coloring);
            guitarModels.put(modelId, result);
        }
        return result;
    }
}
