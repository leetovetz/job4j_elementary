package ru.job4j.calculator;

public class Fit {
    public static final short BASE_HEIGHT_MAN = 100;
    public static final short BASE_HEIGHT_WOMAN = 110;
    public static final double WEIGHT_MULTIPLIER = 1.15;

    public static double calculateManWeight(short height) {
        return (height - BASE_HEIGHT_MAN) * WEIGHT_MULTIPLIER;
    }

    public static double calculateWomanWeight(short height) {
        return (height - BASE_HEIGHT_WOMAN) * WEIGHT_MULTIPLIER;
    }

    public static void main(String[] args) {
        short heightMan = 187;
        short heightWoman = 160;
        double manWeight = Fit.calculateManWeight(heightMan);
        double womanWeight = Fit.calculateWomanWeight(heightWoman);
        System.out.println(String.format("Man %d is %.2f", heightMan, manWeight));
        System.out.println(String.format("Woman %d is %.2f", heightWoman, womanWeight));
    }
}
