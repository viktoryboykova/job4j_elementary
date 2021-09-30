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

    public static int calc(int finish) {
        int count = 0;
        for (int number = 1; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int finish = 5;
        rez(finish);
        finish = 11;
        rez(finish);
        finish = 2;
        rez(finish);
    }

    private static void rez(int finish) {
        System.out.println("Количество простых чисел от 1 до " + finish + " = " + calc(finish));
    }
}