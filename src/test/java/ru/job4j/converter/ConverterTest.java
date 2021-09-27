package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert8568rubThen100euro() {
        float in = 8568;
        float expected = 100;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);

    }

    @Test
    public void whenConvert36500rubThen500dollar() {
        float in = 36500;
        float expected = 500;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}