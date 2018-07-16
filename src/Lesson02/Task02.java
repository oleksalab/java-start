package Lesson02;

import java.util.Scanner;

/*
вычисление площади треугольника
(формула Герона)
 */
public class Task02
{

    public static void main(String[] args)
    {
        // объявление переменных
        double areaTriangle, semiPerimeter;
        int sideA, sideB, sideC;

        System.out.println("Площадь треугольника");
        System.out.println("= (формула Герона) =");

        // ввод параметров
        Scanner input = new Scanner(System.in);

        System.out.print("Введите длину стороны A : ");
        sideA = input.nextInt();
        System.out.println("сторона A = " + sideA);

        System.out.print("Введите длину стороны B : ");
        sideB = input.nextInt();
        System.out.println("сторона B = " + sideB);

        System.out.print("Введите длину стороны C : ");
        sideC = input.nextInt();
        System.out.println("сторона C = " + sideC);

        // вычисление полупериметра треугольника
        semiPerimeter = (sideA + sideB + sideC) / 2;
        System.out.println("Полупериметр = " + semiPerimeter);

        // вычисление площади треугольника
        areaTriangle = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideA));
        System.out.println("Площадь треугольника = " + areaTriangle);

    }

}
