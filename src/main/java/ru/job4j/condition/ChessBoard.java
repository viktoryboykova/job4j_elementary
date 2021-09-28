package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;

        if (isCorrect(x1) && isCorrect(x2) && isCorrect(y1) && isCorrect(y2) && Math.abs(x2 - x1) == Math.abs(y2 - y1) && x1 != x2 && y1 != y2) {
            rsl = Math.abs(x2 - x1);
        }
        return rsl;
    }

    public static boolean isCorrect(int coordinate) {
        return 7 >= coordinate && coordinate >= 0;
    }
}
