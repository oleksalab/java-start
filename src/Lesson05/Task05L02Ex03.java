package Lesson05;

import java.util.Scanner;

/*
вывести прописью введённое число (в формате денежной единицы с центами)
 */
public class Task05L02Ex03 {

    public static void main(String[] args) {

        String balance;
        String numberInWords = "";

        // текстовые наборы
        String[] suffixes = {"dollars", "cents"};
        String[] ranks = {"hundred", "thousand", "million", "billion"};
        String[] decades = {"one", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] singles = {
                "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
        };

        Scanner input = new Scanner(System.in);

        System.out.print("Введите баланс цифрами : ");
        balance = input.nextLine();

        int id = 0;
        // разбиваем число на две части - целую и дробную
        // (разделителем числа может быть `.` либо `,`)
        String[] parts = balance.split("[.|,]");
        // поочередно работаем с целой частью потом с дробной
        for (String part : parts) {

            long value = Long.valueOf(part);

            int i = 3;
            int number;
            while (value > 0) {

                // определяем разряд текущего числа
                if (value < 1000) {
                    // делаем только один заход
                    number = (int) value;
                    value = 0;
                    i = 0;
                } else {
                    // вычисляем вес текущего разряда
                    long fraction = (long) Math.pow(1000, i);
                    number = (int) ((value - (value % fraction)) / fraction);
                    value = value - number * fraction;
                }

                // если для центов указана только одна цифра увеличиваем её разряд
                if (id == 1 && number < 10) {
                    number *= 10;
                }

                // индикатор для пропуска нулевых чисел (пустых разрядов)
                boolean isNumber = false;

                // обрабатываем текущее число
                while (number > 0) {

                    if (number < 20) {
                        // числа до 20 имеют уникальные названия
                        numberInWords += singles[number];
                        number = 0;

                    } else if (number < 100) {
                        // десятки имеют свои названия которые можно объединять с числами меньше 10
                        numberInWords += decades[number / 10] + ((number % 10 > 0) ? " " + singles[number % 10] : "");
                        number = 0;

                    } else if (number < 1000) {
                        // к сотням нужно добавлять приставку с названием разряда
                        int digit = number / 100;
                        numberInWords += singles[digit] + " " + ranks[0] + " ";
                        number = number - digit * 100;
                    }

                    // обработано число
                    isNumber = true;
                }

                // если есть число и разряд больше сотен добавляем название разряда
                numberInWords += (isNumber && i > 0) ? " " + ranks[i] + " " : "";
                i--;
            }

            // добавляем указание на доллары либо центы
            numberInWords += " " + suffixes[id] + " ";
            id++;
        }

        System.out.println("Ваш баланс прописью :");
        System.out.println(numberInWords);
    }
}
