package Lesson08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Lesson08Ex02 {

    public static void main(String[] args) {

        File file = new File("SampleTestTasks-File-Ex02.txt");

        PrintWriter writer = null;

        try {

            writer = new PrintWriter(file);
            writer.print("Hello from Java!");

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }

        writer.close();

        System.out.println("Путь к файлу : " + file.getAbsolutePath());
    }
}
