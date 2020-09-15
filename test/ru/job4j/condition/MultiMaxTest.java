package ru.job4j.condition;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenMaxFirst() {
        int result = MultiMax.max(3, 2, 1);
        Assert.assertThat(result, Is.is(3));
    }

    @Test
    public void whenMaxSecond() {
        int result = MultiMax.max(1, 4, 3);
        Assert.assertThat(result, Is.is(4));
    }

    @Test
    public void whenMaxThird() {
        int result = MultiMax.max(1, 2, 3);
        Assert.assertThat(result, Is.is(3));
    }

    @Test
    public void whenMaxAny() {
        int result = MultiMax.max(2, 2, 2);
        Assert.assertThat(result, Is.is(2));
    }
}