package ru.job4j.condition;

public class DummyBot {
    public static void main(String[] args) {
        String rsl = answer("Hello, Bot.");
        System.out.println(rsl);
        rsl = answer("Goodbye.");
        System.out.println(rsl);
        rsl = answer("How are you?");
        System.out.println(rsl);
    }

    public static String answer(String question) {
        String rsl = "I can't answer this question. Ask other question.";
        if ("Hello, Bot.".equals(question)) {
            rsl = "Hello, human.";
        } else if ("Goodbye.".equals(question)) {
            rsl = "See you soon.";
        }
        return rsl;
    }
}
