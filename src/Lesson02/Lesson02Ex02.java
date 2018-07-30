package Lesson02;

import java.util.Scanner;

public class Lesson02Ex02
{
    public static void main(String[] args)
    {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Scanner scanner = new Scanner(System.in);

        String name;
        int x;

        System.out.print("Enter your name : ");

        name = scanner.nextLine();

        System.out.print("Enter value : ");

        x = scanner.nextInt();

        System.out.println(name + ", your value is " + x);

    }
}
