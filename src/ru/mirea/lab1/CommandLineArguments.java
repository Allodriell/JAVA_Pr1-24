package ru.mirea.lab1;
import java.util.Scanner;
public class CommandLineArguments {
    public static void main(String[] args) {
        System.out.println("Аргументы командной строки:");

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}