package ru.job4j.array;

public class Defragment {

    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int nullIndex = index; /* указатель на null ячейку. */
                for (int index1 = 0; index1 < array.length; index1++) {
                    if (array[index1] != null && index1 > index) {
                        int notNullIndex = index1;
                        swap(array, nullIndex, notNullIndex);
                        break;
                    }
                }
            }
        }
        return array;
    }

    public static String[] swap(String[] array, int nullIndex, int notNullIndex) {
        if (nullIndex >= array.length || notNullIndex >= array.length) {
            return array;
        }
        String zamena = array[nullIndex];
        array[nullIndex] = array[notNullIndex];
        array[notNullIndex] = zamena;
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
