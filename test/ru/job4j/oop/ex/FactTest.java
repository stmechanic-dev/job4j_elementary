package ru.job4j.oop.ex;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenNumberLessThen0() {
        Fact.calc(-2);
    }

    @Test
    public void when3then6() {
        int rsl = Fact.calc(3);
        assertThat(rsl, is(6));
    }
}