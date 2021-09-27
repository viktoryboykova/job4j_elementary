package ru.job4j.condition;

public class Point {
    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(0, 0, 3, 0);
        double result3 = Point.distance(0, 1, 2, 1);
        System.out.println("Result (0;0) to (2;0) is " + result1);
        System.out.println("Result (0;0) to (3;0) is " + result2);
        System.out.println("Result (0;1) to (2;1) is " + result3);
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        int razn1 = x2 - x1;
        int razn2 = y2 - y1;
        double step1 = Math.pow(razn1, 2);
        double step2 = Math.pow(razn2, 2);
        double summa = step1 + step2;
        return Math.sqrt(summa);
    }
}
