package ru.job4j.loop;

public class Fitness {

    public static int calc(int ivankg, int nikkg) {
        int month = 0;
        while (ivankg <= nikkg) {
            ivankg = ivankg * 3;
            nikkg = nikkg * 2;
            month += 1;
        }
        return month;
    }
}
