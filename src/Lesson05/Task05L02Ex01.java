package Lesson05;

import java.util.Arrays;
import java.util.Scanner;

/*
перевернуть исходный массив на 90, 180, 270 градусов по часовой
 */
public class Task05L02Ex01 {

    public static void main(String[] args) {

        int size;
        int option;
        int[][] matrix;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите размер матрицы : ");
        size = input.nextInt();

        System.out.println();

        System.out.println("Исходная матрица");
        // формируем массив под матрицу
        matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = j + 1;
            }
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println();

        System.out.println("Выберите угол поворота матрицы : ");
        System.out.print("(1 - 90\u00B0, 2 - 180\u00B0, 3 - 270\u00B0) => ");
        option = input.nextInt();

        System.out.println();

        switch (option) {
            case 1:
                System.out.println("Поворот на 90\u00B0");

                for (int y = 0; y < size / 2; y++) {
                    for (int x = y; x < size - y - 1; x++) {
                        int temp = matrix[y][x];
                        matrix[y][x] = matrix[size - 1 - x][y];
                        matrix[size - 1 - x][y] = matrix[size - 1 - y][size - 1 - x];
                        matrix[size - 1 - y][size - 1 - x] = matrix[x][size - 1 - y];
                        matrix[x][size - 1 - y] = temp;
                    }
                }
                break;
            case 2:
                System.out.println("Поворот на 180\u00B0");

                for (int y = 0; y < size; y++) {
                    for (int x = 0; x < size / 2; x++) {
                        int temp = matrix[y][x];
                        matrix[y][x] = matrix[size - 1 - y][size - 1 - x];
                        matrix[size - 1 - y][size - 1 - x] = temp;
                    }
                }
                break;
            case 3:
                System.out.println("Поворот на 270\u00B0");

                for (int y = 0; y < size / 2; y++) {
                    for (int x = y; x < size - y - 1; x++) {
                        int temp = matrix[y][x];
                        matrix[y][x] = matrix[x][size - 1 - y];
                        matrix[x][size - 1 - y] = matrix[size - 1 - y][size - 1 - x];
                        matrix[size - 1 - y][size - 1 - x] = matrix[size - 1 - x][y];
                        matrix[size - 1 - x][y] = temp;
                    }
                }
                break;
            default:
                System.out.println("Нет такого варианта!");
                break;
        }

        // отображаем результирующую матрицу
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
