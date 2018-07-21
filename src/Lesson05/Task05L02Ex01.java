package Lesson05;

import java.util.Arrays;

/*
перевернуть исходный массив на 90, 180, 270 градусов по часовой
 */
public class Task05L02Ex01 {

    public static void main(String[] args) {

        int[][] matrix = new int[5][5];

        System.out.println("Исходная матрица");

        // формируем исходную матрицу массива
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                matrix[i][j] = j + 1;
            }

            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println();
        System.out.println("Поворот на 90");

        System.out.println();
        System.out.println("Поворот на 180");

        System.out.println();
        System.out.println("Поворот на 270");

        // поворот на 270 градусов
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = i; j < matrix.length - i - 1; j++) {

                // сохраняем значение текущей ячейки
                int temp = matrix[i][j];

                // перемещаем значения справа вверх
                matrix[i][j] = matrix[j][matrix.length-1-i];

                // перемещаем значения снизу направо
                matrix[j][matrix.length-1-i] = matrix[matrix.length-1-i][matrix.length-1-j];

                // перемещаем значения слева вниз
                matrix[matrix.length-1-i][matrix.length-1-j] = matrix[matrix.length-1-j][i];

                // назначаем значение слева
                matrix[matrix.length-1-j][i] = temp;
            }

        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

    }

}

/*
        // поворот на 90 градусов
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                matrix90[i][j] = matrix[(matrix.length - 1) - j][i];
            }

            System.out.println(Arrays.toString(matrix90[i]));
        }

        System.out.println();

        // поворот на 180 градусов
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                matrix180[i][j] = matrix[(matrix.length - 1) - i][(matrix.length - 1) - j];
            }

            System.out.println(Arrays.toString(matrix180[i]));
        }

        System.out.println();

        // поворот на 270 градусов
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                matrix270[i][j] = matrix[j][((matrix.length - 1) - i)];
            }

            System.out.println(Arrays.toString(matrix270[i]));
        }
*/
