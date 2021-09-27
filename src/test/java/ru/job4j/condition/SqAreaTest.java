package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Then2() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double out = SqArea.math(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K2Then2() {
        double p = 10;
        double k = 2;
        double expected = 5.55;
        double out = SqArea.math(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP5K4Then2() {
        double p = 5;
        double k = 4;
        double expected = 1;
        double out = SqArea.math(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}