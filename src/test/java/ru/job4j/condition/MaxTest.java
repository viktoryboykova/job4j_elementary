package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenLeft10Right5Expected10() {
        int left = 10;
        int right = 5;
        int expected = 10;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenLeft7Right13Expected13() {
        int left = 7;
        int right = 13;
        int expected = 13;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenLeft7Right7Expected7() {
        int left = 7;
        int right = 7;
        int expected = 7;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }
}