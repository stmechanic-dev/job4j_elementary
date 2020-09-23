package ru.job4j.condition;

public class Max {
    public static void main(String[] args) {
        System.out.println(max(2, 5));
        System.out.println(max(3, 1));
        System.out.println(max(2, 2));
    }

    public static int max(int left, int right) {
        boolean compare = left > right;
        int result = compare ? left : right;
        return result;
    }

    public static int max(int first, int second, int third) {
        return max(first,
                    max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(max(first, fourth),
                        max(second, third));
    }
}
