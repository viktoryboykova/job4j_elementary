package ru.job4j.converter;

public class Converter {

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(8568);
        float dollar = Converter.rubleToDollar(36500);
        System.out.println("8568 rubles are " + euro + " euro.");
        System.out.println("36500 rubles are " + dollar + " dollar.");
    }

    public static float rubleToDollar(float rub) {
        return rub / 73;
    }

    public static float rubleToEuro(float rub) {
        return rub / 85.68f;
    }
}

