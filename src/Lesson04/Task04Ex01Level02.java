package Lesson04;

import java.util.Scanner;

/*
нарисовать фигуру в форме треугольника
 */
public class Task04Ex01Level02
{
    public static void main(String[] args)
    {
        int height;
        int numStars = 0;
        char pattern = '*';

        Scanner input = new Scanner(System.in);

        System.out.print("Введите высоту фигуры : ");
        height = input.nextInt();

        int line = 1;
        while (line <= height * 2 - 1)
        {
            // добавляем новый символ к текущей линии
            System.out.print(pattern);

            numStars++;

            // если достигли конец линии - переходим на новую
            if (numStars >= line || numStars >= height * 2 - line)
            {
                System.out.println();
                line++;

                // сбрасываем счётчик символов в линии
                numStars = 0;
            }
        }

    }
}
