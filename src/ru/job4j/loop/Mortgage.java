package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 1;
        double credit = (amount + amount * percent * 0.01) - salary;
        while (credit > 0) {
            credit += credit * percent * 0.01;
            credit -= salary;
            year++;
        }
        return year;
    }
}
