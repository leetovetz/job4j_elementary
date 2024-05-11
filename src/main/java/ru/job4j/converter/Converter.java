package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float euroInput = 140;
        float euroExpected = 2;
        float euroOutput = Converter.rubleToEuro(euroInput);
        boolean euroPassed = euroExpected == euroOutput;
        System.out.println("140 rubles are 2 euro. Test result : " + euroPassed);

        float dollarInput = 180;
        float dollarExpected = 3;
        float dollarOutput = Converter.rubleToDollar(dollarInput);
        boolean dollarPassed = dollarExpected == dollarOutput;
        System.out.println("180 rubles are 3 dollars. Test result : " + dollarPassed);
    }
}