package ru.job4j.oop.ex;

public class Fact {
    public static void main(String[] args) {
        System.out.println(new Fact().calc(-2));
    }

    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n should be greater than 0");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
