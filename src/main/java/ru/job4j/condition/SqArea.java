package ru.job4j.condition;

public class SqArea {

    public static void main(String[] args) {
        double square = SqArea.math(6, 2);
        System.out.println("p = 6, k = 2, s = 2, real square is " + square);
    }

    private static double math(double p, double k) {
        double shirina = p / (2 * (k + 1));
        double dlina = shirina * k;
        return shirina * dlina;

    }
}
