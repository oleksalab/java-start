package Lesson07;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Lesson07Ex04 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        // формируем дату с помощью календаря
        calendar.set(Calendar.YEAR, 1981);
        calendar.set(Calendar.MONTH, Calendar.OCTOBER);
        calendar.set(Calendar.DAY_OF_MONTH, 11);

        Date date = calendar.getTime();
        System.out.println("Указанная дата : " + date);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
        System.out.println("Дата по формату : " + dateFormat.format(date));

    }
}
