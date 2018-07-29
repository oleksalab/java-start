package Lesson07;

import java.util.Scanner;

/*
вычислить расстояние Хэмминга между двумя числами
 */
public class Task07L02Ex02 {

    public static void main(String[] args) {

        int value1;
        int value2;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите два числа :");

        System.out.print("Число #1 : ");
        value1 = input.nextInt();

        System.out.print("Число #2 : ");
        value2 = input.nextInt();

        System.out.println();

        System.out.println("Расстояние Хэмминга :");
        // вычисляем расстояние Хэмминга
        calcHamming(value1, value2);
    }

    // вычисление расстояния Хэмминга
    private static void calcHamming(int value1, int value2) {

        // получаем бинарный вид заданных чисел
        String txtValue1 = Integer.toBinaryString(value1);
        String txtValue2 = Integer.toBinaryString(value2);

        // определяем максимальную ширину разрядов
        int maxSize = (txtValue1.length() > txtValue2.length() ? txtValue1.length() : txtValue2.length()) + 1;

        // форматируем представление чисел в бинарном виде
        txtValue1 = String.format("[%" + maxSize + "s]", txtValue1).replace(' ', '0');
        txtValue2 = String.format("[%" + maxSize + "s]", txtValue2).replace(' ', '0');

        // выводим числа на экран
        System.out.println("Число #1\t: " + txtValue1);
        System.out.println("Число #2\t: " + txtValue2);

        // определяем разницу между числами в разрядах
        String result = Integer.toBinaryString(value1 ^ value2);

        int distance = 0;
        // подсчитываем расстояние Хэмминга
        for (int i = 0; i < result.length(); i++) {

            // считаем позиции равные `1`
            if (result.charAt(i) == '1') {

                distance++;
            }
        }

        // форматируем и выводим результат
        result = String.format("[%" + maxSize + "s]", result).replace(' ', '0');
        System.out.println("Результат\t: " + result + " = " + distance);
    }
}
