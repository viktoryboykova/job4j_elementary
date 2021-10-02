package ru.job4j.array;

public class MinDiapason {

    public static int findMin(int[] array, int start, int finish) {
        if (start < 0 || finish >= array.length || finish < 0 || start >= array.length || start > finish) {
            return -10000;
        }
            int min = array[start];
            for (int i = start + 1; i <= finish; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min;
        }
    }
