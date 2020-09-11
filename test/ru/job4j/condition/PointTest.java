package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when37to95Then6() {
        int x1 = 3;
        int y1 = 7;
        int x2 = 9;
        int y2 = 5;
        double expected = 6.33;
        double out = Point.distance(x1,y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when14to62Then5() {
        int x1 = 1;
        int y1 = 4;
        int x2 = 6;
        int y2 = 2;
        double expected = 5.38;
        double out = Point.distance(x1,y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when25to83Then6() {
        int x1 = 2;
        int y1 = 5;
        int x2 = 8;
        int y2 = 3;
        double expected = 6.33;
        double out = Point.distance(x1,y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}