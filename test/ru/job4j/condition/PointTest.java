package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when37to95Then6() {
        Point point1 = new Point(3, 7);
        Point point2 = new Point(9, 5);
        double expected = 6.33;
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when14to62Then5() {
        Point point1 = new Point(1, 4);
        Point point2 = new Point(6, 2);
        double expected = 5.38;
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when25to83Then6() {
        Point point1 = new Point(2, 5);
        Point point2 = new Point(8, 3);
        double expected = 6.33;
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when123To456Then5() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(4, 5, 6);
        double expected = 5.19;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}