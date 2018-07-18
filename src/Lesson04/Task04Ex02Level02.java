package Lesson04;

/*
вывести простые числа от 1 до 100
 */
public class Task04Ex02Level02
{
    public static void main(String[] args)
    {
        boolean isPrime;
        String listPrimes = "";

        System.out.println("Список простых чисел от 1 до 100");

        for (int number = 2; number <= 100; number++)
        {
            isPrime = true;

            // проверяем число перебором
            for (int i = 2; i <= number / 2; i++)
            {
                if (number % i == 0)
                {
                    isPrime = false;
                }
            }

            // вывод подходящего числа
            if(isPrime)
            {
                listPrimes += number + ", ";
            }
        }

        // убираем лишний символ запятой в конце списка
        listPrimes = listPrimes.substring(0, listPrimes.lastIndexOf(','));

        System.out.print(listPrimes);
    }
}
