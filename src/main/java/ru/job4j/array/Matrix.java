package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] umn = new int[size][size];
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                umn[i - 1][j - 1] = i * j;
            }
        }
        return umn;
    }
}
