package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void whenMondaythen1() {
        String name = "Понедельник";
        int expected = 1;
        int out = MultipleSwitchWeek.nameOfDay(name);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenFridaythen5() {
        String name = "Friday";
        int expected = 5;
        int out = MultipleSwitchWeek.nameOfDay(name);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenCatThen1() {
        String name = "Cat";
        int expected = -1;
        int out = MultipleSwitchWeek.nameOfDay(name);
        Assert.assertEquals(expected, out);
    }
}