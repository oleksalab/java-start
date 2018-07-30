package Lesson03;

public class Lesson03Ex03
{
    public static void main(String[] args)
    {
        int max;

        int a = 5;
        int b = 6;
        int c = 7;

        if (a > b)
        {
            // уровень вложенности 1

            if (a > c)
            {
                // уровень вложенности 2

                max = a;

                System.out.println("Max : " + max);
            }
        }
        else
        {
            if (b > c)
            {
                max = b;

                System.out.println("Max : " + max);
            }
            else
            {
                if (c > a)
                {
                    max = c;

                    System.out.println("Max : " + max);
                }
            }
        }
    }
}
