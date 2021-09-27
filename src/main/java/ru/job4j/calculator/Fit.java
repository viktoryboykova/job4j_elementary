package ru.job4j.calculator;

public class Fit {

    public static void main(String[] args) {
       double heightM = 175;
       double heightF = 168;
       double weightM = Fit.formulaM(heightM);
       double weightF = Fit.formulaF(heightF);
        System.out.println("Идеальный вес для мужчины с ростом " + heightM + " = " + weightM);
        System.out.println("Идеальный вес для женщины с ростом " + heightF + " = " + weightF);
    }

    public static double formulaF(double heightF) {
        return (heightF - 110) * 1.15;
    }

    public static double formulaM(double heightM) {
        return (heightM - 100) * 1.15;
    }
}

