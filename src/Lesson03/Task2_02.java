package Lesson03;

import java.util.Scanner;

/*
определить лежит ли точка внутри треугольника с заданными вершинами
А(0,0), В(4,4), С(6,1)
 */
public class Task2_02
{
    public static void main(String[] args)
    {
        int dotA_X = 0, dotA_Y = 0;
        int dotB_X = 4, dotB_Y = 4;
        int dotC_X = 6, dotC_Y = 1;

        int dotX, dotY;

        int valueA, valueB, valueC;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите координаты точки :");

        System.out.print("координата точки X = ");
        dotX = input.nextInt();

        System.out.print("координата точки Y = ");
        dotY = input.nextInt();

        // проверка вхождения точки в область треугольника
        valueA = (dotA_X - dotX) * (dotB_Y - dotA_Y) - (dotB_X - dotA_X) * (dotA_Y - dotY);
        valueB = (dotB_X - dotX) * (dotC_Y - dotB_Y) - (dotC_X - dotB_X) * (dotB_Y - dotY);
        valueC = (dotC_X - dotX) * (dotA_Y - dotC_Y) - (dotA_X - dotC_X) * (dotC_Y - dotY);

        if ((valueA >= 0 && valueB >= 0 && valueC >= 0) || (valueA <= 0 && valueB <= 0 && valueC <= 0))
        {
            System.out.println("Точка внутри треугольника");
        }
        else
        {
            System.out.println("Точка за пределами треугольника");
        }

    }
}
