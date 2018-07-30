package Lesson08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Lesson08Ex03 {

    public static void main(String[] args) {

        File file = new File("SampleTestTasks-File-Ex03.txt");

        try (PrintWriter writer = new PrintWriter(file)) {

            writer.print("Hello from Java!");

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }

        System.out.println("Путь к файлу : " + file.getAbsolutePath());
    }
}
