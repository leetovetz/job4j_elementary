package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Maria Petrova";
        names[2] = "John Doe";
        names[3] = "Ivan Ivanov";
        for (int i = 0; i < names.length; i++) {
            System.out.println("names[" + i + "]: " + names[i]);
        }

        System.out.println("Размер массива ages: " + ages.length);
        System.out.println("Размер массива surnames: " + surnames.length);
        System.out.println("Размер массива prices: " + prices.length);
    }
}