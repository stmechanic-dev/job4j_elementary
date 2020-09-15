package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ac, double ab, double bc) {
        return ((ac + ab) > bc) && ((ac + bc) > ab) && ((ab + bc) > ac);
    }
}
