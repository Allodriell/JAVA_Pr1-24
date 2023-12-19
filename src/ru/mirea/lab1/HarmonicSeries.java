package ru.mirea.lab1;

public class HarmonicSeries {
    public static void main(String[] args) {
        int n = 10; // Количество чисел в гармоническом ряде
        double sum = 0.0;

        System.out.println("Первые " + n + " чисел гармонического ряда:");

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
            System.out.printf("H(%d) = %.5f%n", i, sum);
        }
    }
}