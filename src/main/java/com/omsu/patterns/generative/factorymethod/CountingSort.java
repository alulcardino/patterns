package com.omsu.patterns.generative.factorymethod;
import java.util.Arrays;

public class CountingSort implements ISort {
    public void sort(int[] array)
    {
        int max = Arrays.stream(array).max().orElse(0);
        int min = Arrays.stream(array).min().orElse(0);
        int range = max - min + 1;
        double[] count = new double[range];
        double[] output = new double[array.length];
        for (double v : array) {
            count[(int) (v - min)]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = array.length - 1; i >= 0; i--) {
            output[(int) (count[(int) (array[i] - min)] - 1)] = array[i];
            count[(int) (array[i] - min)]--;
        }

        System.arraycopy(output, 0, array, 0, array.length);
    }
}
