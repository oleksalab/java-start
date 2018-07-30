package Lesson05;

public class Lesson05Ex04
{
    public static void main(String[] args)
    {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = new int[6];

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        for(int i = 0; i < a.length; i++)
        {
            System.out.println("a[" + i + "] = " + a[i] + " ");
        }

        System.out.println();
        // если открыть следующую строку смотрим результат
        b = a;

        System.out.println("b = " + b);

        for (int i = 0; i < b.length; i++)
        {
            System.out.println("b[" + i + "] = " + b[i] + " ");
        }

        System.out.println();

        // если присвоить значение элементу массива `b`
        // смотрим как изменятся значения массива `a`
        b[0] = 6;

        for(int i = 0; i < a.length; i++)
        {
            System.out.println("a[" + i + "] = " + a[i] + " ");
        }

    }
}
