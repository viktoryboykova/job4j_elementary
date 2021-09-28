package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenAb2Ac2Bc2thenTrue() {
        double ab = 2.0;
        double bc = 2.0;
        double ac = 2.0;
        boolean result = Triangle.exist(ab, bc, ac);
        Assert.assertTrue(result);

    }

    @Test
    public void whenAb2Ac2Bc2thenTrue2() {
        double ab = 1.0;
        double bc = 2.0;
        double ac = 4.0;
        boolean result = Triangle.exist(ab, bc, ac);
        Assert.assertFalse(result);

    }
}