package Lesson08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*
метод для сохранения в текстовый файл двухмерного массива целых чисел
 */
public class Task08L01Ex02 {

    public static void main(String[] args) {

        String fileName = "out/L01Ex02-Array2xInt.txt";

        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {11, 22, 33, 44, 55},
                {111, 222, 333, 444, 555}
        };

        // сохраняем массив в указанный файл
        saveToFile(fileName, matrix);

        System.out.println("Готово!");
    }

    // запись массива в файл
    private static void saveToFile(String fileName, int[][] matrix) {

        File file = new File(fileName);

        try (PrintWriter writer = new PrintWriter(file)) {

            for (int i = 0; i < matrix.length; i++) {

                writer.append(ArraysToString(matrix[i])).append(System.lineSeparator());
            }

        } catch (FileNotFoundException fnfe) {

            fnfe.printStackTrace();
        }
    }

    // представление одномерного массива в виде строки
    private static String ArraysToString(int[] list) {

        String result;

        if (list == null) result = "null";
        else if (list.length == 0) result = "";
        else {

            StringBuilder line = new StringBuilder();

            for (int item : list) {

                line.append(item);
                line.append(", ");
            }

            result = line.substring(0, line.lastIndexOf(","));
        }

        return result;
    }
}
