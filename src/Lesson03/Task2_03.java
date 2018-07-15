package Lesson03;

import java.util.Scanner;

/*
является ли заданное 4-x значное число "счастливым"
 */
public class Task2_03
{
    public static void main(String[] args)
    {
        String number;
        int left1, left2, right1, right2;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите 4-х значное число : ");
        number = input.nextLine();

        left1 = number.charAt(0);
        left2 = number.charAt(1);
        right1 = number.charAt(2);
        right2 = number.charAt(3);

        System.out.print("Этот номер - ");

        if ((left1 + left2) == (right1 + right2))
        {
            System.out.println("счастливый");
        }
        else
        {
            System.out.println("обычный");
        }

        //System.out.println("Этот номер - " + ((left1 + left2) == (right1 + right2) ? "счастливый" : "обычный"));

    }
}
