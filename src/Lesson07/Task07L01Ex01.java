package Lesson07;

import java.util.Calendar;
import java.util.Date;

/*
узнать сколько милисекунд прошло между двумя датами - текущей и месяц назад
 */
public class Task07L01Ex01 {

    public static void main(String[] args) {

        Date dateCurrent = new Date();
        System.out.println("Текущая дата : " + dateCurrent);

        // текущая дата в милисекундах
        long millisCurrent = dateCurrent.getTime();

        Calendar calendar = Calendar.getInstance();
        // сообщаем календарю исходную дату
        calendar.setTime(dateCurrent);

        // делаем смещение на 1 месяц назад
        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) - 1);
        // получаем дату в прошлом (месяц назад)
        Date dateLastMonth = calendar.getTime();
        System.out.println("Дата месяц назад : " + dateLastMonth);

        // дата месяц назад в милисекундах
        long millisLastMonth = dateLastMonth.getTime();

        // вычисляем разницу между двумя датами
        long millisDiff = millisCurrent - millisLastMonth;
        System.out.println("Между ними " + millisDiff + " милисекунд");

        // разница между датами в днях
        long millisDays = millisDiff / (60 * 60 * 24 * 1000);
        System.out.println("В днях это время равно : " + millisDays + " ");

    }
}
