package Pr_2;

import java.util.Scanner;

public class _2_TestBall {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты старта мяча:");

        _2_Ball ball1 = new _2_Ball(scanner.nextInt(),scanner.nextInt());

        System.out.println("Вы ввели: " + ball1.getX() + " и " +ball1.getY());

        System.out.println("Введите новые координаты для изменения положения мяча: ");

        ball1.setXY(scanner.nextInt(), scanner.nextInt());

        System.out.println("Введите на сколько хотите подвинуть мяч: ");
        ball1.move(scanner.nextInt(),scanner.nextInt());
        System.out.println(ball1.toString());
    }
}