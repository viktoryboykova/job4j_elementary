package ru.job4j.calculator;

public class Calculator {

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void minus(int first, int second) {
        int result = first - second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculator.plus(100, 500);
        Calculator.plus(4, 2);
        Calculator.plus(3, 5);
        Calculator.minus(300, 100);
        Calculator.minus(9, 6);
        Calculator.minus(66, 50);
    }
}
