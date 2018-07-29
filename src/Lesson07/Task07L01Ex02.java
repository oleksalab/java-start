package Lesson07;

/*
написать свой вариант метода Arrays.toString() для int[]
 */
public class Task07L01Ex02 {

    public static void main(String[] args) {

        // разные наборы для проверки метода
        int[][] lists = {
                {1, 2, 3, 4, 5},
                new int[7],
                null,
                {}
        };

        System.out.println("Свой метод на разных наборах данных");

        // проверяем метод на разных наборах данных
        int i = 0;
        for (int[] list : lists) {

            System.out.println();
            System.out.println("Массив #" + (i + 1) + " :");
            // применяем свой метод к массиву
            System.out.println(ArraysToString(list));

            i++;
        }
    }

    private static String ArraysToString(int[] list) {

        String result;

        // если массив не инициализирован
        if (list == null) {

            result = "null";

        // если массив пуст
        } else if (list.length == 0) {

            result = "";

        } else {

            StringBuilder line = new StringBuilder();

            // формируем строку из массива
            for (int item : list) {

                line.append(item);
                line.append(", ");
            }

            // удаляем из строки крайний разделитель
            result = line.substring(0, line.lastIndexOf(","));
        }

        return "{" + result + "}";
    }
}
