package Lesson05;

import java.util.Scanner;

/*
подсчитать сколько раз заданный символ встречается в введённой строке
 */
public class Task05L01Ex04 {

    public static void main(String[] args) {

        String text;
        char symbol;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите строку текста :");
        text = input.nextLine();

        System.out.print("Введите символ для подсчёта : ");
        symbol = input.next().charAt(0);

        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            // поиск символа и подсчёт количества
            if (text.charAt(i) == symbol)
            {
                counter++;
            }
        }

        System.out.println("Количество символов '" + symbol + "' в строке : " + counter);

    }
}
