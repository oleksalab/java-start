package Lesson08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson08Ex04 {

    public static void main(String[] args) {

        File file = new File("SampleTestTasks-File-04.txt");

        StringBuilder buffer = new StringBuilder();

        try (Scanner input = new Scanner(file)) {

            for (; input.hasNextLine(); ) {

                buffer.append(input.nextLine()).append(System.lineSeparator());
            }

        } catch (FileNotFoundException fnfe) {

            fnfe.printStackTrace();
        }
    }
}
