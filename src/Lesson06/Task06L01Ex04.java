package Lesson06;

import java.util.Scanner;

/*
линейный поиск элемента в массиве целых чисел
если элемент есть в массиве - вернуть его индекс, иначе - код `-1`
 */
public class Task06L01Ex04 {

    public static void main(String[] args) {

        int item;
        int result;

        // формируем исходный массив
        int[] list = createArray();

        Scanner input = new Scanner(System.in);

        System.out.print("Введите элемент для поиска : ");
        item = input.nextInt();

        // выполняем поиск элемента в массиве
        result = searchItem(list, item);

        System.out.println("Индекс элемента в списке : " + result);
    }

    // поиск элемента в массиве
    private static int searchItem(int[] list, int item) {

        for (int i = 0; i < list.length; i++) {

            if (list[i] == item) {

                return i;
            }
        }

        return -1;
    }

    // создание массива целых чисел
    private static int[] createArray() {

        int length;
        int[] list;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите размер массива : ");
        length = input.nextInt();

        list = new int[length];

        System.out.println("Введите элементы массива :");
        for (int i = 0; i < length; i++) {

            System.out.print("[" + i + "] = ");
            list[i] = input.nextInt();
        }

        return list;
    }
}
