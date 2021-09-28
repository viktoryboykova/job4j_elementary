package ru.job4j.condition;

public class Game {
    public static void main(String[] args) {
        menu("tanks");
    }

    public static void menu(String name) {
        if (name.equals("super mario")) {
            System.out.println("Start super mario.");
        } else {
            System.out.println("It's a mistake");
        }
        if (name.equals("tanks")) {
            System.out.println("Start tanks.");
        }
        if (name.equals("tetris")) {
            System.out.println("Start tetris.");
        }
    }
}
