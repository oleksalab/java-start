package Lesson04;

/*
вывести простые числа от 1 до 100
 */
public class Task04Ex02Level02
{
    public static void main(String[] args)
    {
        boolean isPrime;

        System.out.println("Простые числа от 1 до 100");

        for (int number = 2; number <= 100; number++)
        {
            isPrime = true;

            for (int i = 2; i <= number / 2; i++)
            {
                if (number % i == 0)
                {
                    isPrime = false;
                }
            }

            if(isPrime)
            {
                System.out.print(number + ", ");
            }
        }

    }
}
