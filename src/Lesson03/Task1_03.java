package Lesson03;

import java.util.Scanner;

/*
определить количество дней в заданном году
высокосный год или обычный
366 => 2016, 2020
 */
public class Task1_03
{
    public static void main(String[] args)
    {
        int year;

        double value;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите год : ");
        year = input.nextInt();

        System.out.print("Этот год - ");

        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0)
        {
            System.out.println("обычный (365 дней)");
        }
        else
        {
            System.out.println("високосный (366 дней)");
        }

    }
}
