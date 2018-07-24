package Lesson06;

import java.util.Scanner;

/*
метод рисующий прямоугольник из `*`, параметры метода - длина и ширина
 */
public class Task06L01Ex03 {

    public static void main(String[] args) {

        int width;
        int height;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите ширину прямоугольника : ");
        width = input.nextInt();

        System.out.print("Введите высоту прямоугольника : ");
        height = input.nextInt();

        System.out.println();

        drawRectangle(width, height);
    }

    private static void drawRectangle(int width, int height) {

        char value;

        // высота прямоугольника (вертикально)
        for (int i = 0; i < height; i++) {
            // ширина прямоугольника (горизонтально)
            for (int j = 0; j < width; j++) {
                // рисуем элементы рамки прямоугольника в текущей строке
                if (i == 0 || i == (height - 1) || j == 0 || j == (width - 1)) {
                    value = '*';
                } else {
                    value = ' ';
                }

                System.out.print(value);
            }

            // переход на новую строку
            System.out.println();
        }

    }
}
