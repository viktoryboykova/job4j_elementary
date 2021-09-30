package ru.job4j.condition;

public class SqArea {

    public static double math(double p, double k) {
        double shirina = p / (2 * (k + 1));
        double dlina = shirina * k;
        return shirina * dlina;
    }

    public static void main(String[] args) {
        double square = SqArea.math(6, 2);
        double square2 = SqArea.math(10, 2);
        double square3 = SqArea.math(5, 4);
        System.out.println("p = 6, k = 2, s = 2, real square is " + square);
        System.out.println("p = 10, k = 2, s = 5.55, real square is " + square2);
        System.out.println("p = 5, k = 4, s = 1, real square is " + square3);
    }
}
