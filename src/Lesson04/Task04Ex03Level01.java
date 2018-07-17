package Lesson04;

import java.util.Scanner;

/*
вывести таблицу умножения на 5 в формате `5 х 2 = 10`
 */
public class Task04Ex03Level01
{
    public static void main(String[] args)
    {
        int number;

        System.out.print("Введите число : ");

        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        System.out.println("Таблица умножения :");

        // строим таблицу умножения для числа
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

    }
}
