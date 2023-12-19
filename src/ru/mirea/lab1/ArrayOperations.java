package ru.mirea.lab1;
import java.util.Scanner;
public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Сумма элементов с использованием цикла do while
        int sumDoWhile = 0;
        int indexDoWhile = 0;
        do {
            sumDoWhile += array[indexDoWhile];
            indexDoWhile++;
        } while (indexDoWhile < size);

        // Сумма элементов с использованием цикла while
        int sumWhile = 0;
        int indexWhile = 0;
        while (indexWhile < size) {
            sumWhile += array[indexWhile];
            indexWhile++;
        }

        // Поиск максимального и минимального элементов
        int maxElement = array[0];
        int minElement = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }

        System.out.println("Сумма элементов массива (цикл do while): " + sumDoWhile);
        System.out.println("Сумма элементов массива (цикл while): " + sumWhile);
        System.out.println("Максимальный элемент массива: " + maxElement);
        System.out.println("Минимальный элемент массива: " + minElement);
    }
}