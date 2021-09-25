package ru.job4j.condition;

public class TrgArea {

    public static void main(String[] args) {
        double square = TrgArea.math(2, 2, 2);
        System.out.println("Square of trg (2, 2, 2) is " + square);
    }

    private static double math(double x1, double x2, double x3) {
        double pp = (x1 + x2 + x3) / 2;
        double koren = pp * (pp - x1) * (pp - x2) * (pp - x3);
        return Math.sqrt(koren);
    }
}
