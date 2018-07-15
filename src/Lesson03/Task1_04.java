package Lesson03;

import java.util.Scanner;

/*
определить существует ли треугольник
a+b>c, a+c>b, b+c>a, (a>0, b>0, c>0)
 */
public class Task1_04
{
    public static void main(String[] args)
    {
        boolean exist;
        int sideA, sideB, sideC;

        System.out.println("Введите стороны треугольника");

        Scanner input = new Scanner(System.in);

        System.out.print("сторона A = ");
        sideA = input.nextInt();

        System.out.print("сторона B = ");
        sideB = input.nextInt();

        System.out.print("сторона C = ");
        sideC = input.nextInt();

        // проверка правил существования треугольника
        exist = (sideA + sideB) > sideC && (sideA + sideC) > sideB && (sideB + sideC) > sideA;
        exist = exist && sideA > 0 && sideB > 0 && sideC > 0;

        System.out.print("Треугольник существует : " + (exist ? "да" : "нет"));

    }
}
