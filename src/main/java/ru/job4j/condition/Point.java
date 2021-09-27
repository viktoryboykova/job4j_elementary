package ru.job4j.condition;

public class Point {
    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("Result (0;0) to (2;0) is " + result);
    }

    private static double distance(int x1, int y1, int x2, int y2) {
        int razn1 = x2 - x1;
        int razn2 = y2 - y1;
        double step1 = Math.pow(razn1, 2);
        double step2 = Math.pow(razn2, 2);
        double summa = step1 + step2;
        return Math.sqrt(summa);

    }
}
