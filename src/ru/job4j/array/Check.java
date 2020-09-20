package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean search : data) {
            if (data[0] != search) {
                result = false;
                break;
            }
        }
        return result;
    }
}
