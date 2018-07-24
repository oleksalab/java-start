package Lesson06;

import java.util.Arrays;
import java.util.Scanner;

/*
написать метод возвращающий максимальное число из массива целых чисел
 */
public class Task06L01Ex01 {

    public static void main(String[] args) {

        int length;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите размер массива : ");
        length = input.nextInt();

        int[] list = new int[length];

        System.out.println("Введите элементы массива :");
        for (int i = 0; i < length; i++) {

            System.out.print("[" + i + "] = ");
            list[i] = input.nextInt();
        }

        System.out.println("Исходный список элементов :");
        System.out.println(Arrays.toString(list));

        System.out.println("Максимальное значение в списке = " + getMax(list));

    }

    private static int getMax(int[] list) {

        int max = 0;

        for (int i : list) {

            if (i >= max) {
                max = i;
            }
        }

        return max;
    }
}
