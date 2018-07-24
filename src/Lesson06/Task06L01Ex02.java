package Lesson06;

import java.util.Scanner;

/*
параметрами метода являются  - целое число, вещественное и строка
метод возвращает конкатенацию строки с суммой вещественного и целого чисел
 */
public class Task06L01Ex02 {

    public static void main(String[] args) {

        String currency;
        double balance;
        int bonus;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите название валюты : ");
        currency = input.nextLine();

        System.out.print("Введите исходный баланс (формат 0,0) : ");
        balance = input.nextDouble();

        System.out.print("Введите начисленый бонус (формат 0) : ");
        bonus = input.nextInt();

        System.out.println("Ваш текущий баланс :");
        System.out.println(checkBalance(currency, balance, bonus));
    }

    private static String checkBalance(String currency, double balance, int bonus) {

        return currency + " : " + sumTotal(balance, bonus);
    }

    private static double sumTotal(double balance, int bonus) {

        return balance + bonus;
    }

}
