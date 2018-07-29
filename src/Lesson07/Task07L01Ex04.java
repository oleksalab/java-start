package Lesson07;

import java.util.Formatter;

/*
10 строк со значением числа `Пи` и разным количество знаков после запятой
 */
public class Task07L01Ex04 {

    public static void main(String[] args) {

        StringBuilder piForms = new StringBuilder();
        Formatter precision = new Formatter(piForms);

        for (int i = 1; i <= 10; i++) {

            // форматируем значение и добавляем переход на новую строку
            precision.format("%." + (i + 1) + "f%n", Math.PI);
        }

        System.out.print(piForms.toString());
    }
}

// простое форматирование строки
// System.out.println(String.format("%.2f", Math.PI));
