package Lesson03;

import java.util.Scanner;

/*
найти большее из 4-х чисел
 */
public class Task1_01
{
    public static void main(String[] args)
    {
        int maxNumber;
        int number1, number2, number3, number4;

        System.out.println("Введите четыре числа:");

        Scanner input = new Scanner(System.in);

        System.out.print("Число #1 : ");
        number1 = input.nextInt();

        System.out.print("Число #2 : ");
        number2 = input.nextInt();

        System.out.print("Число #3 : ");
        number3 = input.nextInt();

        System.out.print("Число #4 : ");
        number4 = input.nextInt();

        // определяем максимальное число
        maxNumber = number1 > number2 ? number1 : number2;
        maxNumber = maxNumber > number3 ? maxNumber : number3;
        maxNumber = maxNumber > number4 ? maxNumber : number4;

        System.out.println("Максимальное число = " + maxNumber);

    }

}
