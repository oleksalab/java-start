package Lesson02;

import java.util.Scanner;

/*
вычисление длины окружности по её радиусу
 */
public class Task03
{
    public static void main(String[] args)
    {
        int radius;
        double circleLength;

        System.out.println("Длина окружности по её радиусу");

        // ввод параметров
        Scanner input = new Scanner(System.in);

        System.out.print("Введите радиус окружности : ");
        radius = input.nextInt();

        // вычисление длины окружности
        circleLength = 2 * Math.PI * radius;
        System.out.println("Длина окружности = " + circleLength);

    }

}
