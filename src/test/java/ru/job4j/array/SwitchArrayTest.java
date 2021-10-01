package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap0to32() {
        int[] input = {1, 2, 3, 4};
        int source = 4;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 4};
        Assert.assertArrayEquals(expected, result);
    }
}