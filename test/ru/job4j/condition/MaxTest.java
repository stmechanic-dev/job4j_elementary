package ru.job4j.condition;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.hamcrest.core.Is;

public class MaxTest {

    @Test
    public void whenMax2To5Then5() {
        int result = Max.max(2, 5);
        Assert.assertThat(result, Is.is(5));
    }

    @Test
    public void whenMax3To1Then3() {
        int result = Max.max(3, 1);
        Assert.assertThat(result, Is.is(3));
    }

    @Test
    public void whenMax2To2Then2() {
        int result = Max.max(2, 2);
        Assert.assertThat(result, Is.is(2));
    }

    @Test
    public void whenMax1To2To3Then3() {
        int result = Max.max(1, 2, 3);
        Assert.assertThat(result, Is.is(3));
    }

    @Test
    public void whenMax4To3To2To1Then4() {
        int result = Max.max(4, 3, 2, 1);
        Assert.assertThat(result, Is.is(4));
    }
}