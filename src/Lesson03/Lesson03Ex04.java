package Lesson03;

public class Lesson03Ex04
{
    public static void main(String[] args)
    {
        int max;

        int a = 5;
        int b = 6;
        int c = 7;

        if (a > b && a > c)
        {
            max = a;
        }
        else if (b > c)
        {
            max = b;
        }
        else
        {
            max = c;
        }

        System.out.println("Max : " + max);

    }
}
