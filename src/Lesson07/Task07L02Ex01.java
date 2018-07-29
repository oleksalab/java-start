package Lesson07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
вывести отличия между текущей датой и введённой в консоли
 */
public class Task07L02Ex01 {

    public static void main(String[] args) {

        String format = "dd.MM.yyyy";

        String txtDateCustom;
        String txtDateCurrent;

        Date dateCurrent = new Date();
        SimpleDateFormat dateView = new SimpleDateFormat(format);

        Scanner input = new Scanner(System.in);

        System.out.print("Введите любую дату (" + format + "): ");
        txtDateCustom = input.nextLine();

        System.out.println();

        try {
            // проверяем введённую дату
            Date dateCustom = dateView.parse(txtDateCustom);

            // преобразуем текущую дату к заданному формату
            txtDateCurrent = dateView.format(dateCurrent);
            // уточним текстовый вид введённой даты
            // FIXME стоит ли сообщать об ошибке (пока оставил поведение java)
            // например, если был указан месяц = 30 - java не выдаст ошибку
            // она просто автоматом выполнит смещение даты вперёд от января
            // на указанное количество месяцев - т.е. дата сместится
            txtDateCustom  = dateView.format(dateCustom);

            System.out.println("Текущая дата\t: " + txtDateCurrent);
            System.out.println("Введённая дата\t: " + txtDateCustom);

            System.out.println();

            System.out.println("Отличия между этими датами:");

            // ищем и показываем отличия между датами
            showDifference(txtDateCurrent, txtDateCustom);

        } catch (ParseException pe) {

            //pe.printStackTrace();
            System.out.println("Ошибка при вводе даты!");
        }
    }

    // поиск и отображение отличий между двумя строками в заданном формате
    private static void showDifference(String srcTxt, String dstTxt) {

        String[] parts = {"день", "месяц", "год"};

        String[] srcParts = srcTxt.split("[.]");
        String[] dstParts = dstTxt.split("[.]");

        // индикатор наличия отличий
        boolean isDifferent = false;
        for (int i = 0; i < srcParts.length; i++) {

            // сравниваем текущие элементы даты
            if (!srcParts[i].equals(dstParts[i])) {

                // показываем отличие
                System.out.println(parts[i] + " -\t" + srcParts[i] + " <=> " + dstParts[i]);

                // обнаружено отличие
                isDifferent = true;
            }
        }

        // если отличия не найдены
        if (!isDifferent) {

            System.out.println("нет различий");
        }
    }
}
