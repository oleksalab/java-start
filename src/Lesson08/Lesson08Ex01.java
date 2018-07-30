package Lesson08;

import java.io.File;
import java.io.IOException;

public class Lesson08Ex01 {

    public static void main(String[] args) {

        File fileTwo = new File("a.txt");

        try {

            fileTwo.createNewFile();

        } catch (IOException e) {

            System.out.println(e);
        }

        File fileThree = new File("b.txt");
        fileTwo.renameTo(fileThree);
        fileThree.delete();

        File folder = new File("lib");
        folder.mkdirs();

        File fileOne = new File(".");

        File[] arrayFile = fileOne.listFiles();
        for (File file : arrayFile) {

            System.out.println(file);
        }

    }
}
