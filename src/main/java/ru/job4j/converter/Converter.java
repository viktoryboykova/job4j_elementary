package ru.job4j.converter;

public class Converter {

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(8568);
        float dollar = Converter.rubleToDollar(36500);
        System.out.println("8568 rubles are " + euro + " euro.");
        System.out.println("36500 rubles are " + dollar + " dollar.");
        float in1 = 8568;
        float expected1 = 100;
        float out1 = Converter.rubleToEuro(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("8568 rubles are 100 euro. Test result: " + passed1);
        float in2 = 36500;
        float expected2 = 500;
        float out2 = Converter.rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("36500 rubles are 500 dollars. Test result: " + passed2);

    }

    private static float rubleToDollar(float rub) {
        return rub / 73;
    }

    private static float rubleToEuro(float rub) {
        return rub / 85.68f;
    }
}

