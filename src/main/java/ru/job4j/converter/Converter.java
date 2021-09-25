package ru.job4j.converter;

public class Converter {

    public static void main(String[] args) {
        float rub1 = 8568;
        float rub2 = 36500;
        float euro = Converter.rubleToEuro(rub1);
        float dollar = Converter.rubleToDollar(rub2);
        System.out.println(rub1 + " rubles are " + euro + " euro");
        System.out.println(rub2 + " rubles are " + dollar + " dollar");
    }

    private static float rubleToDollar(float rub) {
        return rub / 73;
    }

    private static float rubleToEuro(float rub) {
        return rub / 85.68f;
    }
}
