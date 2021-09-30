package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        if (number < 2) {
            return false;
        }
        boolean prime = true;
        for (int num = 2; num <= number - 1; num++) {
            if (number % num == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}