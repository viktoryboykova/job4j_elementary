package ru.job4j.condition;

public class Club {
    public static void main(String[] args) {
        go1(true, true);
        go1(true, false);
        go1(false, true);
        go1(false, false);
    }

    public static void go1(boolean allowByParent, boolean hasMoney) {
        if (allowByParent || hasMoney) {
            System.out.println("You can go to the club");
        } else {
            System.out.println("You can't go");
        }
    }
}
