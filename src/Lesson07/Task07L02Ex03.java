package Lesson07;

import java.util.Formatter;
import java.util.Scanner;

/*
определить шаблон (минимальное уникальное число) ряда
 */
public class Task07L02Ex03 {

    public static void main(String[] args) {

        String stopSymbol = ".";

        Scanner input = new Scanner(System.in);
        StringBuilder buffer = new StringBuilder();
        Formatter row = new Formatter(buffer);

        System.out.println("Введите набор последовательностей :");
        System.out.println("'Enter' - переход на новую строку");
        System.out.println("'.' в начале строки - конец ввода");

        String line = "";
        while (!line.equals(stopSymbol)) {
            // вводим построчно последовательности
            line = input.nextLine();
            row.format("%s%n", line);
        }

        // удаляем символ окончания ввода
        buffer.deleteCharAt(buffer.indexOf(stopSymbol));

        // получаем набор строк
        String[] rows = buffer.toString().split(System.lineSeparator());

        for (int i = 0; i < rows.length; i++) {
            // для каждой строки выполняем поиск шаблона
            System.out.print("Строка #" + i + " : " + rows[i] + " => ");
            System.out.println("шаблон : " + getPattern(rows[i]));
        }
    }

    // запуск рекурсивного поиска шаблона
    private static String getPattern(String chain) {

        // запускаем поиск шаблона
        return getPattern(chain, 1);
    }

    // рекурсивный поиск шаблона в строке
    private static String getPattern(String line, int i) {

        // выбираем шаблон для проверки
        String pattern = line.substring(0, i);

        // используем шаблон как делитель строки
        String[] parts = line.split(pattern);

        // есть в строке что-то кроме шаблона
        if (parts.length > 0) {

            // переходим к следующей проверке
            return getPattern(line, i + 1);

        } else {

            // возвращаем этот шаблон
            return pattern;
        }
    }

}
