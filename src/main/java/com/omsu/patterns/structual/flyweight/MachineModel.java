package com.omsu.patterns.structual.flyweight;
import java.util.Objects;

public class MachineModel {
    private int modelId;
    private String guitar3DModel;
    private String color;
    private String coloring;

    public MachineModel(int modelId, String guitar3DModel, String color, String coloring) {
        this.modelId = modelId;
        this.guitar3DModel = guitar3DModel;
        this.color = color;
        this.coloring = coloring;
    }

    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    public String getGuitar3DModel() {
        return guitar3DModel;
    }

    public void setGuitar3DModel(String guitar3DModel) {
        this.guitar3DModel = guitar3DModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColoring() {
        return coloring;
    }

    public void setColoring(String coloring) {
        this.coloring = coloring;
    }

    @Override
    public String toString() {
        return "modelId = " + modelId + ", " + guitar3DModel + ", " + "color = " + color + ", coloring = " + coloring;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MachineModel that = (MachineModel) o;
        return modelId == that.modelId &&
                Objects.equals(guitar3DModel, that.guitar3DModel) &&
                Objects.equals(color, that.color) &&
                Objects.equals(coloring, that.coloring);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelId, guitar3DModel, color, coloring);
    }
}
