package Lesson05;

import java.util.Arrays;

public class Lesson05_8
{
    public static void main(String[] args)
    {
        String text = "Hello";
        String text1 = "World";

        char[] txt = text.toCharArray();
        System.out.println(Arrays.toString(txt));

        System.out.println();

        System.out.println("> split");

        String str = "123,345,567";
        String[] items = str.split("[,]");

        for (String item : items)
        {
            System.out.println(item);
        }

    }
}
