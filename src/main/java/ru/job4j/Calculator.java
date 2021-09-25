package ru.job4j;

import java.sql.SQLOutput;

public class Calculator {

    public static void main(String[] args) {
        int result = Calculator.plus(1, 2);
        int result1 = Calculator.minus(4, 3);
        int result2 = result + result1;
        System.out.println(result2);
    }

    public static int plus(int first, int second) {
        return first + second;
    }

    public static int minus(int first1, int second1) {
        return first1 - second1;
    }
}
