package ru.job4j.condition;

public class Cinema {
    public static void main(String[] args) {
        agePerson(21);
        agePerson(16);
    }

    private static void agePerson(int age) {
        System.out.println("The age of person is " + age);
        if (age >= 18) {
            System.out.println("Welcome to see the film");
        } else {
            System.out.println("Goodbye");
        }
    }
}
