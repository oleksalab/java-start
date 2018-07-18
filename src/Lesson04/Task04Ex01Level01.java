package Lesson04;

import java.util.Scanner;

/*
нарисовать обои, количество полос нужно вводить
 */
public class Task04Ex01Level01
{
    public static void main(String[] args)
    {
        char pattern;
        int totalStrips;

        int stripWidth = 5;
        int stripLength = 7;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите количество полос : ");
        totalStrips = input.nextInt();

        // длина полосы (вертикально)
        for (int h = 0; h < stripLength; h++)
        {
            // количество полос (горизонтально)
            for (int i = 0; i < totalStrips; i++)
            {
                // узор в зависимости - чётное или нечётное
                pattern = (i % 2 == 0) ? '*' : '+';

                // рисуем полосу с выбранным узором
                for (int j = 0; j < stripWidth; j++)
                {
                    System.out.print(pattern);
                }
            }

            // переход на новую строку
            System.out.println();
        }
    }
}
