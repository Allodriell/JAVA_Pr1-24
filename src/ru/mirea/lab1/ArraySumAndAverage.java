package ru.mirea.lab1;

import java.util.Scanner;
public class ArraySumAndAverage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // Ввод размера массива
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int[] array = new int[size];

        // Инициализация массива
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        double average = (double) sum / size;

        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое элементов массива: " + average);
    }
}
