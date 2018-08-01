package Lesson08;

import java.io.File;

/*
метод для вывода на экран списка всех каталогов внутри заданного параметром
 */
public class Task08L01Ex03 {

    public static void main(String[] args) {

        String folderName;
        folderName = ".";
        folderName = "/";
        folderName = "out";
        folderName = "src";

        // выводим каталоги из заданного
        showFolders(folderName);

    }

    // вывод каталогов внутри заданного
    private static void showFolders(String folderName) {

        File folder = new File(folderName);
        File[] items = folder.listFiles();

        for (File item : items) {

            // если текущий элемент каталог
            if (item.isDirectory()) {
                // выводим его на экран
                System.out.println(item);
            }
        }
    }
}
