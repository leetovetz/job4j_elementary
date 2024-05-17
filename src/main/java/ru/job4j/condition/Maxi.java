package ru.job4j.condition;

public class Maxi {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static void main(String[] args) {
        int result = max(1, 2);
        System.out.println(result);
    }
}

