package ru.job4j.live;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoopTest {

    @Test
    public void test() {
        assertEquals(1, Loop.sum(1));
        assertEquals(3, Loop.sum(12));
        assertEquals(6, Loop.sum(123));
        assertEquals(10, Loop.sum(1234));
        assertEquals(15, Loop.sum(12345));
    }
}
