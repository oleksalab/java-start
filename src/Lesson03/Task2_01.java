package Lesson03;

import java.util.Scanner;

/*
определить лежит ли точка внутри круга с заданным радиусом
radius = 4
 */
public class Task2_01
{
    public static void main(String[] args)
    {
        int radius, dotX, dotY;
        double distance;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите радиус круга : ");
        radius = input.nextInt();

        System.out.print("Координата точки - X = ");
        dotX = input.nextInt();

        System.out.print("Координата точки - Y = ");
        dotY = input.nextInt();

        distance = Math.sqrt(dotX * dotX + dotY *dotY);

        if (distance <= radius)
        {
            System.out.println("Точка внутри круга");
        }
        else
        {
            System.out.println("Точка за пределами круга");
        }

        //System.out.println("Точка " + (distance <= radius ? "внутри круга" : "за пределами круга"));
    }

}

