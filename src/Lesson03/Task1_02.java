package Lesson03;

import java.util.Scanner;

/*
определить номер подъезда и этаж по номеру квартиры
в доме: 9 этажей, 4 подъезда, на этаже 4 квартиры
 */
public class Task1_02
{
    public static void main(String[] args)
    {
        int totalLevels = 9;
        int totalEntries = 4;
        int roomsByLevel = 4;

        int room, level, entry;
        double value;

        System.out.print("Введите номер квартиры : ");

        Scanner input = new Scanner(System.in);
        room = input.nextInt();

        // общее количество квартир в доме
        int totalRooms = totalLevels * totalEntries * roomsByLevel;
        System.out.println("Всего квартир в доме : " + totalRooms);

        System.out.println("Данные по квартире : ");

        if (room <= totalRooms)
        {
            // определяем номер подъезда
            value = (double) (room - 1) / (totalLevels * roomsByLevel) + 1;
            entry = (int) value;

            // определяем номер этажа
            level = (int) ((value - entry) * totalLevels + 1);

            System.out.println("подъезд : " + entry + ", этаж : " + level);
        }
        else
        {
            System.out.println("В доме нет такой квартиры");
        }

    }
}
