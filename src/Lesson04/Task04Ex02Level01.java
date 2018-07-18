package Lesson04;

import java.util.Scanner;

/*
вычислить факториал введённого числа (4 < n < 16)
 */
public class Task04Ex02Level01
{
    public static void main(String[] args)
    {
        int number;
        int result = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите число : ");
        number = input.nextInt();

        // проверяем диапазон входных значений
        if (number > 4 && number < 16)
        {
            // вычисляем факториал числа
            for (int i = 1; i <= number; i++)
            {
                result *= i;
            }

            System.out.println("Факториал этого числа = " + result);
        }
        else
        {
            System.out.println("Это число за пределами диапазона");
        }

    }
}
