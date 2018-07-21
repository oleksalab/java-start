package Lesson05;

import java.util.Scanner;

/*
вывести прописью введённое число (в формате денежной единицы с центами)
 */
public class Task05L02Ex03 {

    public static void main(String[] args) {

        double balanсе;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите текущий баланс : ");
        balanсе = input.nextDouble();

        String value = String.valueOf(balanсе);
        System.out.println("Вы ввели : " + value);

    }
}
