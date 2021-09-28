package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        boolean condition = left > right;
        return condition ? left : right;
    }

    public static void main(String[] args) {
        int msg = Max.max(10, 5);
        System.out.println(msg);
    }

}
