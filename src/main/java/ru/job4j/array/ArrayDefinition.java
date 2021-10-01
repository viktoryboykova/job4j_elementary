package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Егорыч Васильев";
        names[1] = "Киса Васильев";
        names[2] = "Викуха Бойкова";
        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }

    }
}
