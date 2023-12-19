package ru.mirea.lab1;

public class FactorialCalculator {
    public static void main(String[] args) {
        int number = 100000; // Здесь можно изменить число, для которого нужно вычислить факториал

        long factorial = Factorial.calculateFactorial(number);

        System.out.println("Факториал числа " + number + " равен " + factorial);
    }
}