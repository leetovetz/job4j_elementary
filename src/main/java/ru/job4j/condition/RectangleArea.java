package ru.job4j.condition;

public class RectangleArea {
    public static double square(int p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double result = l * h;
        return result;
    }

    public static void main(String[] args) {
        double result1 = RectangleArea.square(6, 2);
        System.out.println("p = 6, k = 2, s should be 2, real = " + result1);

        double result2 = RectangleArea.square(4, 1);
        System.out.println("p = 4, k = 1, s should be 1, real = " + result2);
    }
}
