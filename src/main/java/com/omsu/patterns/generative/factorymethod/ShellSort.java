package com.omsu.patterns.generative.factorymethod;

public class ShellSort  implements ISort{
    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int step = n / 2; step > 0; step /= 2) {
            for (int i = step; i < n; i++) {
                for (int j = i - step; j >= 0 && array[j] > array[j + step] ; j -= step) {
                    int x = array[j];
                    array[j] = array[j + step];
                    array[j + step] = x;
                }
            }
        }
    }
}
