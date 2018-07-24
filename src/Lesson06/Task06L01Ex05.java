package Lesson06;

import java.util.Scanner;

/*
метод возвращающий количество слов в введённой строке
 */
public class Task06L01Ex05 {

    public static void main(String[] args) {

        String text;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите строку текста :");
        text = input.nextLine();

        System.out.println("Количество слов в строке : " + countWords(text));

    }

    // количество слов в строке
    private static int countWords(String text) {

        // разбиваем строку на слова пробелом
        String[] words = text.split("[\\s]");

        return words.length;
    }

}
