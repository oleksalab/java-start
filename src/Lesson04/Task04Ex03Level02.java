package Lesson04;

import java.util.Scanner;

/*
нарисовать фигуру в виде песочных часов для заданной ширины
 */
public class Task04Ex03Level02
{
    public static void main(String[] args)
    {
        int width;
        char value;
        char pattern = '*';

        Scanner input = new Scanner(System.in);

        System.out.print("Введите высоту фигуры : ");
        width = input.nextInt();

        if (width % 2 != 0)
        {
            // высота фигуры (вертикально)
            for (int i = 1; i <= width; i++)
            {
                // длина линии (горизонтально)
                for (int j = 1; j <= width; j++)
                {
                    // рисунок текущей линии - символ либо пробел
                    if (i >= j && i >= (width + 1) - j || (i <= j && i <= (width + 1) - j))
                    {
                        value = pattern;
                    }
                    else
                    {
                        value = ' ';
                    }

                    System.out.print(value);

                    // достигли ли конец текущей линии
                    if (j % width == 0)
                    {
                        System.out.println();
                    }
                }
            }
        }
        else
        {
            System.out.println("Число должно быть нечётным!");
        }

    }
}
