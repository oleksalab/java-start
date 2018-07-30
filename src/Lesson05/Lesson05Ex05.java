package Lesson05;

import java.util.Arrays;

public class Lesson05Ex05
{
    public static void main(String[] args)
    {
        // правильное копирование массивов

        int[] a = { 78, 33, 45, 8, 10 };
        int[] b = new int[6];

        for(int i = 0; i < a.length; i++)
        {
            b[i] = a[i];
        }

        System.out.println("a = " + a);
        for(int i = 0; i < a.length; i++)
        {
            System.out.println("a[" + i + "] = " + a[i] + " ");
        }

        System.out.println();

        System.out.println("b = " + b);
        for (int i = 0; i < b.length; i++)
        {
            System.out.println("b[" + i + "] = " + b[i] + " ");
        }

        System.out.println();

        System.out.println(Arrays.toString(a));
    }
}
