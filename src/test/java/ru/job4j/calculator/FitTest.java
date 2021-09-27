package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMen175Then86() {
        double height = 175;
        double expected = 86.25;
        double out = Fit.formulaM(height);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWomen168Then66() {
        double height = 168;
        double expected = 66.69;
        double out = Fit.formulaF(height);
        Assert.assertEquals(expected, out, 0.01);
    }
}