package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String in = "Hello, Bot.";
        String expected = "Hello, human.";
        String out = DummyBot.answer(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenByeBot() {
        String in = "Goodbye.";
        String expected = "See you soon.";
        String out = DummyBot.answer(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenUnknownBot() {
        String in = "What is your name?";
        String expected = "I can't answer this question. Ask other question.";
        String out = DummyBot.answer(in);
        Assert.assertEquals(expected, out);
    }
}