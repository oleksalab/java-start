package Lesson06;

import java.util.Scanner;

public class Lesson06Ex01 {
    public static void main(String[] args) {

        int a;
        int b;

        double c;
        double d;

        Scanner input = new Scanner(System.in);

        System.out.print("Переменная A = ");
        a = input.nextInt();

        System.out.print("Переменная B = ");
        b = input.nextInt();

        System.out.print("Переменная C = ");
        c = input.nextDouble();

        System.out.print("Переменная D = ");
        d = input.nextDouble();

        int result1 = sum(a, b);
        print(result1);

        int result2 = multiply(a, b);
        print(result2);

        double result3 = sum(c, d);
        print(result3);

    }

    public static int sum(int a, int b) {

        int result = a + b;

        return result;
    }

    public static double sum(double a, double b) {

        return a + b;
    }

    public static int multiply(int a, int b) {

        return a * b;
    }

    public static void print(int value) {
        System.out.println("Результат = " + value);
    }

    public static void print(double value) {
        System.out.println("Результат = " + value);
    }

}
