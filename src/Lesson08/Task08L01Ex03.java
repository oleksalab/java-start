package Lesson08;

import java.io.File;
import java.io.IOException;

/*
метод для вывода на экран списка всех каталогов внутри заданного параметром
 */
public class Task08L01Ex03 {

    public static void main(String[] args) {

        String folderName;
        //folderName = "out";
        //folderName = "src";
        //folderName = ".";
        //folderName = "/";
        folderName = "C:\\Program Files\\";

        File folder = new File(folderName);

        System.out.println("Исходный каталог : ");
        System.out.println(folder.getAbsolutePath());

        System.out.println();

        System.out.println("Список каталогов внутри :");
        // выводим каталоги из заданного
        showFolders(folder);
    }

    // вывод каталогов внутри заданного
    private static void showFolders(File folder) {

        File[] items = folder.listFiles();

        for (File item : items) {

            // если текущий элемент каталог
            if (item.isDirectory()) {
                // выводим его на экран
                System.out.println(item.getName());
            }
        }
    }
}
