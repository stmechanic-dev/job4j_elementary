package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP4K1Then1() {
        int p = 4;
        int k = 1;
        double expected = 1.0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6K2Then2() {
        int p = 6;
        int k = 2;
        double expected = 2.0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K3Then3() {
        int p = 8;
        int k = 3;
        double expected = 3.0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}