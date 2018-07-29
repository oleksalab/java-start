package Lesson07;

import java.util.Scanner;

/*
ввести число в бинарном виде и вывести на экран в десятичном виде
 */
public class Task07L01Ex03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите число в бинарном виде : ");
        String number = input.nextLine();

        System.out.println();


        // метод #1 - собственный метод
        System.out.println("Метод #1");

        // выполняем преобразование
        int decimal1 = binaryToDecimal(number);

        if (decimal1 < 0) {

            System.out.println("В строке указан недопустимый символ!");

        } else {

            System.out.println("Это число в десятичном виде : " + decimal1);
        }

        System.out.println();


        // метод #2 - стандартный метод с обработкой исключений
        System.out.println("Метод #2");

        try {

            // выполняем преобразование
            int decimal2 = Integer.parseInt(number, 2);
            System.out.println("Это число в десятичном виде : " + decimal2);

        } catch (NumberFormatException nfe) {

            System.out.println("В строке указан недопустимый символ!");
        }

    }

    // бинарный вид в десятичный с помощью операций сдвига
    private static int binaryToDecimal(String number) {

        int result = 0;

        for (int i = 0; i < number.length(); i++) {

            int digit = number.charAt(i);

            // если текущая цифра не `0` и не `1`
            if (digit < 48 || digit > 49) {

                return -1;
            }

            if (digit == '1') {
                // определяем вес бита и прибавляем его
                result += 1 << (number.length() - 1) - i;
            }
        }

        return result;
    }
}
