package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForThreeThenSix() {
        int n = 3;
        int result = Factorial.calc(n);
        int expected = 6;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
        int result = Factorial.calc(n);
        int expected = 120;
        Assert.assertEquals(result, expected);
    }
}