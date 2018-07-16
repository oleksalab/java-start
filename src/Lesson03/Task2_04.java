package Lesson03;

import java.util.Scanner;

/*
является ли заданное 6-ти значное число "палидромом"
палиндром одинаково читается слева-на-право и справа-на-лево
 */
public class Task2_04
{
    public static void main(String[] args)
    {
        String number, reverse;
        int leftToRight, rightToLeft;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите 6-ти значное число : ");
        number = input.nextLine();

        // получаем обратный порядок цифр (символов)
        reverse = new StringBuilder(number).reverse().toString();

        // берём значения прямого и обработного чисел
        leftToRight = Integer.valueOf(number);
        rightToLeft = Integer.valueOf(reverse);

        System.out.println(leftToRight + " <=> " + rightToLeft);

        // определяем результат проверки
        System.out.println("Это число - " + (leftToRight == rightToLeft ? "палиндром" : "обычное"));

    }
}
