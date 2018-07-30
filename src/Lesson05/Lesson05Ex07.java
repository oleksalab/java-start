package Lesson05;

public class Lesson05Ex07
{
    public static void main(String[] args)
    {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.println("[" + i +", " + j +"] => " + matrix[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println(">");

        int[][] b = new int[8][];
        for (int i = 0; i < b.length; i++)
        {
            System.out.print(i + " => ");

            b[i] = new int[i];
            for (int j = 0; j < b[i].length; j++)
            {
                b[i][j] = i + j;

                System.out.print( + b[i][j] + " ");
            }

            System.out.println();
        }

    }
}
