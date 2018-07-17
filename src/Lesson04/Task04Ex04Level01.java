package Lesson04;

import java.util.Scanner;

/*
вывести прямоугольник состоящий из `*`
 */
public class Task04Ex04Level01
{
    public static void main(String[] args)
    {
        int width;
        int height;

        char pattern = '*';

        Scanner input = new Scanner(System.in);

        System.out.print("Введите ширину прямоугольника : ");
        width = input.nextInt();

        System.out.print("Введите высоту прямоугольника : ");
        height = input.nextInt();

        // высота
        for (int i = 0; i < height; i++)
        {
            // ширина
            for (int j = 0; j < width; j++)
            {
                System.out.print(pattern);
            }

            System.out.println();
        }
    }
}
