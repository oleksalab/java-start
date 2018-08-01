package Lesson08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;

/*
метод для считывания двухмерного массива из файла, размер массива нужно определить
 */
public class Task08L02Ex01 {

    public static void main(String[] args) {

        String fileName = "out/L01Ex02-Array2xInt.txt";

        System.out.println("Исходный файл :");
        System.out.println(fileName);

        // читаем содержимое файла в массив
        int[][] matrix = arrayFromFile(fileName);

        System.out.println();

        // если прочитанный массив не пустой
        if (matrix != null && matrix.length > 0) {

            System.out.println("Массив из файла прочитан :");

            // выводим содержимое массива
            for (int[] list : matrix) {

                System.out.println(Arrays.toString(list));
            }

        } else {

            System.out.println("Данные отсутствуют!");
        }

    }

    // чтение данных из файла в массив
    private static int[][] arrayFromFile(String fileName) {

        File file = new File(fileName);

        // выполняем чтение из файла
        try (Scanner input = new Scanner(file)) {

            StringBuilder buffer = new StringBuilder();
            Formatter line = new Formatter(buffer);

            // читаем файл построчно
            int lines = 0;
            while (input.hasNextLine()) {

                line.format("%s%n", input.nextLine());
                lines++;
            }

            // если данные прочитаны
            if (lines > 0) {

                // преобразуем данные в массив
                return parseData(lines, buffer);
            }

        } catch (FileNotFoundException fnfe) {

            //fnfe.printStackTrace();
            System.out.println("Исходный файл не найден!");
        }

        return null;
    }

    // преобразование текста в массив целых чисел
    private static int[][] parseData(int lines, StringBuilder buffer) {

        int[][] matrix = new int[lines][];

        // разбиваем текст на строки
        String[] rows = buffer.toString().split(System.lineSeparator());

        // перебираем набор строк
        for (int i = 0; i < lines; i++) {

            // разбиваем строку на цифры
            String[] numbers = rows[i].split("[,]");

            // перебираем набор цифр
            matrix[i] = new int[numbers.length];
            for (int j = 0; j < numbers.length; j++) {

                // анализируем и записываем цифры в массив
                matrix[i][j] = Integer.parseInt(numbers[j].trim());
            }
        }

        return matrix;
    }

}

