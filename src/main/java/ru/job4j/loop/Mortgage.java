package ru.job4j.loop;

public class Mortgage {

    public static int year(double amount, double salary, double percent) {
        int year = 0;
        double dolg = amount;
        while (dolg > 0) {
            year += 1;
            dolg = dolg * percent / 100 + dolg - salary;
        }
        return year;
    }
}
