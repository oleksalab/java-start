package Lesson07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Lesson07Ex03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Date date = new Date();
        SimpleDateFormat inputDateFormat = new SimpleDateFormat("dd.MM.yyyy");

        System.out.println("Введите дату (формат dd.MM.yyyy)");
        String inputDate = input.nextLine();

        try {

            date = inputDateFormat.parse(inputDate);

        } catch (ParseException parseError) {

            System.out.println(parseError);
        }

        SimpleDateFormat outputDateFormat = new SimpleDateFormat("dd MMMM yyyy");
        String outputDate = outputDateFormat.format(date);

        System.out.println("Ваша дата : " + outputDate);

        input.close();

    }
}
