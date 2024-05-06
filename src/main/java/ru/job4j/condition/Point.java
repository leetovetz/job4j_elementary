package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow(x2 - x1, 2);
        double second = Math.pow(y2 - y1, 2);
        double result = Math.sqrt(first + second);
        return result;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(0, 0, 3, 4);
        double result3 = Point.distance(1, 5, 4, 1);
        System.out.println("Distance (0, 0) to (2, 0) = " + result1);
        System.out.println("Distance (0, 0) to (3, 4) = " + result2);
        System.out.println("Distance (1, 5) to (4, 1) = " + result3);
    }
}
