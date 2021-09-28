package ru.job4j.condition;

public class Games {
    public static void main(String[] args) {
        go(true, true);
        go(true, false);
        go(false, true);
        go(false, false);
    }

    public static void go(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            System.out.println("You can go to the cinema");
        } else {
            System.out.println("You can't go");
        }
    }
}
