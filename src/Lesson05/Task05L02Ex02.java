package Lesson05;

import java.util.Arrays;
import java.util.Scanner;

/*
перевернуть зеркально одномерный массив
 */
public class Task05L02Ex02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите размер массива : ");
        int length = input.nextInt();

        // инициализирум массив
        int[] list = new int[length];

        System.out.println("Введите элементы массива :");
        for (int i = 0; i < list.length; i++) {

            System.out.print("[" + i + "] = ");
            list[i] = input.nextInt();
        }

        System.out.println("Исходный массив :");
        System.out.println(Arrays.toString(list));

        for (int i = 0; i < list.length / 2; i++) {

            // временно сохраняем значение исходного элемента
            int value = list[i];

            // зеркально переставляем элементы
            list[i] = list[(list.length - 1) - i];
            list[(list.length - 1) - i] = value;
        }

        System.out.println("Зеркальный массив :");
        System.out.println(Arrays.toString(list));
    }
}
