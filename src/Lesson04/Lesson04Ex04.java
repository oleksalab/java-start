package Lesson04;

public class Lesson04Ex04 {

    public static void main(String[] args) {

        // что получим в результате ?
        int i = 0;
        do {

            System.out.println(i++);

        } while (i == 3);

        // вариант предыдущего, результат ?
        i = 0;
        do {

            System.out.println(++i);

        } while (i == 3);
    }
}
