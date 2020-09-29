package ru.job4j.stragery;

public class Triangle implements Shape {
    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return    "   ^    " + ln
                + " /   \\ " + ln
                + "/_____\\" + ln;
    }
}
