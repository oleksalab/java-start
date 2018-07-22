package Lesson05;

import java.util.Arrays;

/*
первая половина массива #2 равна массиву #1,
вторая половина массива #2 - удвоенные значения массива #1
 */
public class Task05L01Ex03 {

    public static void main(String[] args) {

        int[] list1 = {3, 56, 4, 39, 8, 71, 5, 47, 2, 9, 12, 35, 7, 23, 64};
        int[] list2 = new int[list1.length * 2];

        System.out.println("Содержимое массива #1 :");
        System.out.println(Arrays.toString(list1));

        // копируем элементы массива #1 в первую половину массива #2
        System.arraycopy(list1, 0, list2, 0, list1.length);

        // заполняем элементы второй половины массива #2
        int j = list1.length;
        for (int i = 0; i < list1.length; i++) {

            list2[j] = list1[i] * 2;
            j++;
        }

        System.out.println("Содержимое массива #2 :");
        System.out.println(Arrays.toString(list2));
    }
}
