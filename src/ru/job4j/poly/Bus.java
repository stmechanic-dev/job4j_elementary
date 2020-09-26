package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void ride() {
        System.out.println("We are ride.");
    }

    @Override
    public void passengers(int pass) {
        System.out.println(pass + " passengers in a bus.");
    }

    @Override
    public int tankUp(int fuel) {
        return fuel / 3;
    }
}
