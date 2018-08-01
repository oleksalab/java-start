package Lesson08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;

/*
прочитать текст из файла и показать ранжированную статистику использования букв
 */
public class Task08L02Ex02 {

    public static void main(String[] args) {

        String fileName = "out/L02Ex02-TextFile.txt";

        File file = new File(fileName);

        showTextStats(file);
    }

    private static void showTextStats(File file) {

        try (Scanner input = new Scanner(file)) {

            // читаем данные из файла в массив строк
            String[] lines = readLines(input);

            System.out.println("Исходный текст :");
            for (String line : lines) {

                System.out.println(line);
            }

            System.out.println();

            System.out.println("Статистика по буквам :");

            // подсчёт статистики
            calcStats(lines);

        } catch (FileNotFoundException fnfe) {

            fnfe.printStackTrace();
        }

    }

    // вычисление статистики по буквам
    private static void calcStats(String[] lines) {

        // размер таблицы ASCII - 256
        int[][] stats = new int[256][2];

        // построчно обрабатываем текст
        for (String line : lines) {
            // строки разбираем по символьно
            char[] letters = line.toCharArray();
            for (char letter : letters) {

                // учитываем только буквы (без пробелов, точек и т.д.)
                if (letter > 65) {
                    stats[letter][0] = letter;
                    stats[letter][1] = stats[letter][1] + 1;
                }
            }
        }

        // выполняем сортировку данных
        int[][] sortedStats = getSortedStats(stats);

        // отображаем статистику
        showStatsByLetters(sortedStats);
    }

    // получение упорядоченной статистики
    private static int[][] getSortedStats(int[][] stats) {

        // сортируем полученную статистику
        sortStatsByCount(stats);

        // убираем пустые ячейки
        int numLetters = 0;
        for (int i = 0; i < stats.length; i++) {

            if (stats[i][0] > 0) {
                numLetters++;
            }
        }

        return Arrays.copyOfRange(stats, 0, numLetters);
    }

    // сортировка двухмерного массива (убывающий порядок)
    private static void sortStatsByCount(int[][] stats) {

        int letter;
        int counter;

        for (int i = 0; i < stats.length; i++) {
            for (int j = 1; j < (stats.length - i); j++) {

                if (stats[j - 1][1] < stats[j][1]) {

                    letter = stats[j - 1][0];
                    counter = stats[j - 1][1];
                    stats[j - 1][0] = stats[j][0];
                    stats[j - 1][1] = stats[j][1];
                    stats[j][0] = letter;
                    stats[j][1] = counter;

                }
            }
        }
    }

    // вывод статистики по буквам
    private static void showStatsByLetters(int[][] stats) {

        System.out.println("Всего букв : " + stats.length);

        for (int i = 0; i < stats.length; i++) {

            System.out.println((char) stats[i][0] + " => " + stats[i][1]);
        }
    }

    // чтение текстового файла построчно
    private static String[] readLines(Scanner input) {

        StringBuilder buffer = new StringBuilder();
        Formatter row = new Formatter(buffer);

        while (input.hasNextLine()) {

            row.format("%s%n", input.nextLine());
        }

        return buffer.toString().split(System.lineSeparator());
    }
}
