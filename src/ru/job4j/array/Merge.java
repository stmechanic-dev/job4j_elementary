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
            int leftCount = 0;
            int rightCount = 0;
            while (size < rsl.length) {
                if (leftCount < left.length && left[leftCount] <= right[rightCount]) {
                    rsl[size] = left[leftCount];
                    size++;
                    leftCount++;
                } else {
                    rsl[size] = right[rightCount];
                    size++;
                    rightCount++;
                }
            }
        }
        return rsl;
    }
}
