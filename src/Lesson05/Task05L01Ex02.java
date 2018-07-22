package Lesson05;

import java.util.Arrays;
import java.util.Scanner;

/*
создать массив целых цисел вводом из консоли и затем вывести его на экран
 */
public class Task05L01Ex02 {

    public static void main(String[] args) {

        int[] list;
        int length;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите размер массива : ");
        length = input.nextInt();

        // инициализируем массив
        list = new int[length];

        System.out.println("Введите элементы массива :");

        for (int i = 0; i < list.length; i++) {

            System.out.print("[" + i + "] = ");
            list[i] = input.nextInt();
        }

        System.out.println("Содержимое данного массива :");
        System.out.println(Arrays.toString(list));
    }
}
