package Lesson05;

/*
подсчитать количество нечётных чисел в заданном массиве
 */
public class Task05L01Ex01 {

    public static void main(String[] args) {

        int counter = 0;
        int[] list = { 0, 5, 2, 4, 7, 1, 3, 19 };

        String primeList = "";

        for (int number : list) {
            if (!(number % 2 == 0)) {
                counter++;
                primeList += number + ", ";
            }
        }

        System.out.println("Количество нечётных чисел в массиве = " + counter);
        System.out.println("Список нечётных чисел : " + primeList.substring(0, primeList.lastIndexOf(',')));

    }
}
