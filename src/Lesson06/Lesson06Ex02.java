package Lesson06;

public class Lesson06Ex02 {
    public static void main(String[] args) {

        print("welcome");

        System.out.println();

        print("hello", "java");

        System.out.println();

        print("курс", "программирования", "на", "языке", "джава");

    }

    public static void print(String... words) {

        for (String word : words) {

            System.out.println("word : " + word);

        }
    }
}
