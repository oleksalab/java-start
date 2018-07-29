package Lesson06;

import java.util.Arrays;
import java.util.Scanner;

/*
продолжить заданную последовательность
 */
public class Task06L02Ex01 {

    // набор "известных" последовательностей
    static int[][] series = {
            {0, 2, 4, 6, 8, 10, 12},    // n+2 => 14
            {1, 4, 7, 10, 13},          // n+3 => 16
            {1, 3, 9, 27},              // n*3 => 81
            {1, 4, 9, 16, 25},          // n+(2*(i+1)-1) => 36
            {1, 8, 27, 64, 125}         // (i+1) в кубе => 216
    };

    public static void main(String[] args) {

        int nextNumber = 0;

        String line;
        int[] list;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите последовательность из чисел (через запятую) :");
        line = input.nextLine();

        // делаем из введённой строки массив
        list = parseLine2Array(line);

        System.out.println("Ваша последовательность :");
        System.out.println(Arrays.toString(list));

        // определяем следующий член последовательности
        nextNumber = getNextBySeries(list);

        // проверка результата
        if (nextNumber < 0) {

            System.out.println("Неизвестная последовательность!");

        } else {

            System.out.println("Её следующим членом будет : " + nextNumber);
        }

    }

    // определение следующего элемента последовательности
    private static int getNextBySeries(int[] list) {

        // определяем последовательность
        int id = getSeriesByList(list);

        return id;
    }

    // диспетчер для определения алгоритма
    private static int getSeriesByList(int[] list) {

        int result;

        // арифметическая прогрессия
        result = checkAlgebra(list);
        if (result > 0) return result;

        // геометрическая прогрессия
        result = checkGeometry(list);
        if (result > 0) return result;

        // квадратная прогрессия
        result = checkSqrt(list);
        if (result > 0) return result;

        // кубическая прогрессия
        result = checkCube(list);
        if (result > 0) return result;

        return result;
    }

    // алгебраическая прогрессия
    private static int checkAlgebra(int[] list) {

        int result = -1;

        result = (list[1] - list[0] == list[2] - list[1])
                ? list[list.length - 1] + (list[1] - list[0])
                : result;

        return result;
    }

    // геометрическая прогрессия
    private static int checkGeometry(int[] list) {

        int result = -1;

        result = (list[1] / list[0] == list[2] / list[1])
                ? list[list.length - 1] * (list[1] / list[0])
                : result;

        return result;
    }

    // квадратная прогрессия
    private static int checkSqrt(int[] list) {

        double result = -1;

        result = (Math.sqrt(list[1]) - Math.sqrt(list[0]) == Math.sqrt(list[2]) - Math.sqrt(list[1]))
                ? Math.pow((Math.sqrt(list[list.length - 1]) + Math.sqrt(list[1]) - Math.sqrt(list[0])), 2)
                : result;

        return (int) result;
    }

    // кубическая прогрессия
    private static int checkCube(int[] list) {

        double result = -1;

        result = (Math.cbrt(list[1]) - Math.cbrt(list[0]) == Math.cbrt(list[2]) - Math.cbrt(list[1]))
                ? Math.pow((Math.cbrt(list[list.length - 1]) + Math.cbrt(list[1]) - Math.cbrt(list[0])), 3)
                : result;

        return (int) result;
    }

    // определение следующего элемента последовательности
    private static int getNextBySeriesOld(int[] list) {

        // определяем номер последовательности
        int id = getSeriesId(list);

        // если неизвестная последовательность
        if (id < 0) return -1;

        return getNextById(id);
    }

    // вычисление следующего элемента по формулам
    private static int getNextById(int id) {

        int nextValue = 0;

        // последний известный элемент
        int value = series[id][series[id].length - 1];

        switch (id) {
            case 0:
                nextValue = value + 2;
                break;
            case 1:
                nextValue = value + 3;
                break;
            case 2:
                nextValue = value * 3;
                break;
            case 3:
                nextValue = value + (2 * (series[id].length + 1) - 1);
                break;
            case 4:
                nextValue = (int) Math.pow((series[id].length + 1), 3);
                break;
        }

        return nextValue;
    }

    // определение номера последовательности
    private static int getSeriesId(int[] list) {

        for (int i = 0; i < series.length; i++) {

            // если найдено совпадение с одной из "известных"
            if (Arrays.equals(list, series[i])) {

                // возвращаем её номер
                return i;
            }
        }

        // не найдено
        return -1;
    }

    // преобразование строки текста в массив целых чисел
    private static int[] parseLine2Array(String line) {

        int[] list;

        // разбиваем строку на блоки с помощью запятой
        String[] parts = line.split("[,]");

        list = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {

            // получаем значение числа (также убрав из блока лишние пробелы)
            list[i] = Integer.valueOf(parts[i].trim());
        }

        return list;
    }

}
