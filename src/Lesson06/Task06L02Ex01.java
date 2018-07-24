package Lesson06;

/*
продолжить заданную последовательность
 */
public class Task06L02Ex01 {

    public static void main(String[] args) {

        int[][] list = {
                {0, 2, 4, 6, 8, 10, 12},    // 14 - 2*(n-1)
                {1, 4, 7, 10, 13},          // 16 - 3*(n-2)
                {1, 3, 9, 27},              // 81 - 3 в степени n-1
                {1, 4, 9, 16, 25},          // 36 - n в квадрате
                {1, 8, 27, 64, 125}         // 216 - n в кубе
        };


        checkPattern(list);

    }

    private static void checkPattern(int[][] list) {


    }
}

/*
https://www.wolframalpha.com
  */
