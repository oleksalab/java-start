package Lesson08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.Scanner;

/*
консольный текстовый редактор с возможностью сохранения набранного текста в файл
 */
public class Task08L01Ex01 {

    public static void main(String[] args) {

        String stopSymbol = ".";

        Scanner input = new Scanner(System.in);
        StringBuilder buffer = new StringBuilder();
        Formatter row = new Formatter(buffer);

        System.out.println("Простой текстовый редактор");
        System.out.println("Введите текст, для перехода на новую строку - 'Enter'");
        System.out.println("'.' в начале строки - конец ввода, сохранение в файл");

        String line = "";
        while (!line.equals(stopSymbol)) {
            // вводим текст
            line = input.nextLine();
            row.format("%s%n", line);
        }

        // удаляем символ окончания ввода
        buffer.deleteCharAt(buffer.indexOf(stopSymbol));

        // файл для сохранения текста
        File file = new File("out/L01Ex01-TextEditor.txt");

        try (PrintWriter writer = new PrintWriter(file)) {

            // запись текста в файл
            writer.print(buffer);

        } catch (FileNotFoundException fnfe) {

            fnfe.printStackTrace();
        }

        input.close();
    }

}
