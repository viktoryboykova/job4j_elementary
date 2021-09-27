package ru.job4j;

public class Echo {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int three = 3;
        System.out.println(one + two);
        System.out.println(one + two + " text");
        System.out.println("text " + one + two);
        System.out.println(one + two + " text " + two + three);
    }

}
