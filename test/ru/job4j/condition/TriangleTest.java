package ru.job4j.condition;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExistTrue() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, Is.is(true));
    }

    @Test
    public void whenExistFalse() {
        boolean result = Triangle.exist(2.0, 2.0, 5.0);
        assertThat(result, Is.is(false));
    }
}