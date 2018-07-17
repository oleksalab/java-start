package Lesson05;

public class Lesson05_1
{
    public static void main(String[] args)
    {
        String[] list = new String[10];

        list[0] = "1";
        list[1] = "2";
        list[2] = "3";
        list[3] = "4";
        list[4] = "5";
        list[5] = "6";
        list[6] = "7";
        list[7] = "8";
        list[8] = "9";
        list[9] = "10";

        // чтобы отобразить содержимое массива:

        // 1. просто указать переменную массива недостаточно
        System.out.println(list);

        // 2. нужно последовательно обращаться к элементам массива
        for (int i = 0; i < list.length; i++)
        {
            System.out.println("List [" + i + "] : " + list[i]);
        }

    }

}
