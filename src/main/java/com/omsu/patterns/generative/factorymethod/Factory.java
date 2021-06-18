package com.omsu.patterns.generative.factorymethod;

public class Factory {
    public static ISort getSort(Sorts sortName) throws IllegalAccessException {
        if (sortName == Sorts.SHELL) {
            return new ShellSort();
        } else if (sortName == Sorts.HEAP) {
            return new HeapSort();
        } else if (sortName == Sorts.COUNTING) {
            return new CountingSort();
        }
        throw new IllegalArgumentException("Incorrect sort name.");
    }
}
