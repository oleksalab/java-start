package Lesson06;

import java.util.Arrays;

public class Lesson06Ex03 {
    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4, 5};

        System.out.println("Базовый список\t: " + Arrays.toString(list));

        change(list);

        System.out.println("Итоговый список\t: " + Arrays.toString(list));

        restore(list);

        System.out.println("Итоговый список\t: " + Arrays.toString(list));
    }

    private static void change(int[] list) {

        list[4] = list[4] + 5;

        System.out.println("Метод change\t: " + Arrays.toString(list));
    }

    private static void restore(int... list) {

        list[4] = list[4] - 5;

        System.out.println("Метод restore\t: " + Arrays.toString(list));
    }

}
