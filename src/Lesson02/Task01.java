package Lesson02;

import java.util.Scanner;

/*
разложить 5-ти значное число на цифры
 */
public class Task01
{
    public static void main(String[] args)
    {
        // объявление переменных
        String number;

        System.out.println("Введите 5-ти значное число : ");

        // ввод параметров
        Scanner input = new Scanner(System.in);
        number = input.nextLine();

        System.out.println("Ваше число `" + number + "` состоит из таких цифр : ");

        // вывод отдельных цифр
        System.out.println(number.charAt(0));
        System.out.println(number.charAt(1));
        System.out.println(number.charAt(2));
        System.out.println(number.charAt(3));
        System.out.println(number.charAt(4));

    }

}
