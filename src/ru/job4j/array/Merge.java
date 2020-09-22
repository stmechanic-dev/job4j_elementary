package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int size = 0;
        if (left.length == 0) {
            rsl = right;
        } else if (right.length == 0) {
            rsl = left;
        } else {
            for (int i = 0; i < left.length; ) {
                for (int j = 0; j < right.length; ) {
                    if (i < left.length && left[i] <= right[j]) {
                        rsl[size] = left[i];
                        size++;
                        i++;
                    } else {
                        rsl[size] = right[j];
                        size++;
                        j++;
                    }
                }
            }
        }
        return rsl;
    }
}
