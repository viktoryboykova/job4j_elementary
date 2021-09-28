package ru.job4j.condition;

public class LogicNot {

    public static void main(String[] args) {
        int a = 1;
        boolean notEvenAndPositive = notEvenAndPositive(a);
        if (notEvenAndPositive) {
            System.out.println(a + " is notEvenAndPositive");
        }
        a = 2;
        boolean notEvenAndPositive2 = notEvenAndPositive(a);
        if (notEvenAndPositive2) {
            System.out.println(a + " is notEvenAndPositive");
        }
        notEvenAndPositive(2);
        notEvenAndPositive(3);
        notEvenAndPositive(4);
        notEvenAndPositive(5);
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return !isEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || !isPositive(num);
    }
}
