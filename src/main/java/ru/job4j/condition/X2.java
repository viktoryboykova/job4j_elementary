package ru.job4j.condition;

public class X2 {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 1;
        int rsl = X2.calc(a, b, c, x);
        System.out.println("Result is " + rsl);
    }

    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }
}
