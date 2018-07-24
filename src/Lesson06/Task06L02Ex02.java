package Lesson06;

import java.util.Arrays;

/*
найти самый большой палиндром, полученный умножением двух трехзначных чисел
 */
public class Task06L02Ex02 {

    public static void main(String[] args) {

        int value;
        int maxPalindrome = 0;
        int[] operands = new int[2];

        System.out.println("Палиндром от умножения двух 3-х значных чисел");

        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {

                // получаем число умножением двух чисел
                value = i * j;

                // если это число палиндром и он больше чем предыдущий
                if (isPalindrome(value) && value > maxPalindrome) {

                    // сохраняем его как максимальный
                    maxPalindrome = value;
                    // сохраняем числа, с помощью которых он получен
                    operands[0] = i;
                    operands[1] = j;
                }
            }
        }

        System.out.println("Максимальный палиндром = " + maxPalindrome);
        System.out.println("Получен такими цифрами " + Arrays.toString(operands));
    }

    // подготовка значения и запуск проверки на палиндром
    private static boolean isPalindrome(int value) {

        return checkPalindrome(String.valueOf(value));
    }

    // рекурсивная проверка на палиндром
    private static boolean checkPalindrome(String value) {

        if (value.length() == 0 || value.length() == 1) {

            return true;
        }

        // сравниваем первый и последний символ текущей строки
        if (value.charAt(0) == value.charAt(value.length() - 1)) {

            // очередная итерация для проверки следующих символов (ближе к центру)
            return checkPalindrome(value.substring(1, value.length() - 1));
        }

        return false;
    }

/*
    private static boolean checkPalindrome(int value) {

        String txtValue = String.valueOf(value);

        return txtValue.equals(new StringBuilder(txtValue).reverse().toString());
    }
*/

}
