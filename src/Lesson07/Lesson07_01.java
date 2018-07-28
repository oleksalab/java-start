package Lesson07;

import java.util.Date;

public class Lesson07_01 {
    public static void main(String[] args) {

        // определение даты

        Date date1 = new Date();
        System.out.println("Текущая дата : " + date1);

        long time = 0L;
        Date date = new Date(time);
        System.out.println("Отправная дата : " + date);

        long time1 = 1234567891011L;
        Date date2 = new Date(time1);
        System.out.println("Заданная дата : " + date2);

        long millis = System.currentTimeMillis();
        System.out.println("Миллисекунды (после 01-Jan-1970 00:00:00 UTC) :");
        System.out.println(millis);

    }
}
