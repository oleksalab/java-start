package Lesson04;

import java.util.Scanner;

public class Lesson04_2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите число : ");
        int n = input.nextInt();

        int i = 0;

        while (i < n)
        {
            int j = 0;

            while (j < n)
            {
                System.out.print("*");

                j++;
            }

            System.out.print(" ");

            i++;
        }
    }
}
