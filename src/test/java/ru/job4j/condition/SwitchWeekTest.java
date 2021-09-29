package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void when1thenMonday() {
        int day = 15;
        String expected = "Ошибка";
        String out = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, out);
    }
}