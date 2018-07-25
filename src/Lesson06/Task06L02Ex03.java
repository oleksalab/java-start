package Lesson06;

import java.util.Arrays;
import java.util.Scanner;

/*
создать все возможные комбинации из цифр заданного массива, без повторений
 */
public class Task06L02Ex03 {

    public static void main(String[] args) {

        int size;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите размер массива : ");
        size = input.nextInt();

        // формируем исходный набор цифр
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            list[i] = i + 1;
        }

        System.out.println("Исходный массив :");
        System.out.println(Arrays.toString(list));

        System.out.println("Возможные комбинации :");
        // запуск "мутации"
        showCombo(list);
    }

    // сервисный метод для простоты запуска "мутации"
    private static void showCombo(int[] list) {

        // запуск основного метода
        showCombo(list, new int[]{});
    }

    // основной метода построения комбинаций из списка цифр
    private static void showCombo(int[] list, int[] combo) {

        // длина текущей комбинации равна длине списк
        if (combo.length == list.length) {

            // отображаем текущую комбинацию
            System.out.println(Arrays.toString(combo));

            return;
        }

        // перебираем все цифры списка
        for (int item : list) {

            // добавляем ещё один элемент к текущему набору
            int[] newCombo = Arrays.copyOf(combo, combo.length + 1);
            newCombo[newCombo.length - 1] = item;

            // очередная итерация
            showCombo(list, newCombo);
        }
    }
}
