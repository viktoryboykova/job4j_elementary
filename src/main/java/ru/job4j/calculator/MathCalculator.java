package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static void main(String[] args) {
        System.out.println("Результат математических действий равен " + summaAndUmnozhenie(5, 10));
        System.out.println("Результат математических действий равен " + raznostAndDelenie(20, 4));
        System.out.println("Результат математических действий равен " + sumAndUmnAndRaznAndDel(100, 2));
    }

    private static double sumAndUmnAndRaznAndDel(double first, double second) {
        return summa(first, second)
                + umnozhenie(first, second)
                + raznost(first, second)
                + delenie(first, second);
    }

    private static double raznostAndDelenie(double first, double second) {
        return raznost(first, second)
                + delenie(first, second);
    }

    private static double summaAndUmnozhenie(double first, double second) {
        return summa(first, second)
               + umnozhenie(first, second);
    }
}
