package ru.job4j.start;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.start.Fit;

public class FitTest {

    @Test
    public void whenMan184Then96() {
        short in = 184;
        double expected = 96.6;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman170Then69() {
        short in = 170;
        double expected = 69.0;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}