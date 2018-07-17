package Lesson04;

public class Lesson04_3
{
    public static void main(String[] args)
    {
        int n = 10;

        for (int i = 0; i < n; i++)
        {
            if (i == 3)
            {
                continue;
            }

            if (i == 7)
            {
                break;
            }

            System.out.println(i);
        }

    }
}
