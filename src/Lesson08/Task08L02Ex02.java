package Lesson08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
прочитать текст из файла и показать ранжированную статистику использования букв
 */
public class Task08L02Ex02 {

    public static void main(String[] args) {

        String fileName = "L02Ex02-TextFile.txt";

        File file = new File(fileName);

        try (Scanner input = new Scanner(file)) {



        } catch (FileNotFoundException fnfe) {

            fnfe.printStackTrace();
        }


    }
}
