package ru.job4j.oop.transport;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " едет по асфальту.");
    }
}
