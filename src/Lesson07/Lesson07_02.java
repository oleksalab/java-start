package Lesson07;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Lesson07_02 {
    public static void main(String[] args) {

        // форматирование даты

        Date date = new Date();

        SimpleDateFormat simpleDate = new SimpleDateFormat("dd.MM.yy");
        String txtDate = simpleDate.format(date);

        System.out.println("Сегодня : " + txtDate);

        SimpleDateFormat simpleDate2 = new SimpleDateFormat("d MMMM yyyy");
        String txtDate2 = simpleDate2.format(date);

        System.out.println("Сегодня : " + txtDate2 + " год");

    }
}
