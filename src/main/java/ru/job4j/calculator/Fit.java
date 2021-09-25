package ru.job4j.calculator;

public class Fit {

    public static void main(String[] args) {
        double heightM = 175;
        double heightF = 168;
        double weightM = Fit.formulaM(heightM);
        double weightF = Fit.formulaF(heightF);
        System.out.println("Men " + heightM + " is " + weightM);
        System.out.println("Women " + heightF + " is " + weightF);
    }

    private static double formulaF(double heightF) {
        return (heightF - 110) * 1.15;
    }

    private static double formulaM(double heightM) {
        return (heightM - 100) * 1.15;
    }
}

