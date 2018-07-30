package Lesson03;

public class Lesson03Ex02
{
    public static void main(String[] args)
    {
        int price = 200;
        int money = 150;

        // использование условного оператора if
        if (money > price)
        {
            System.out.println("Я смогу купить это");
        }
        else
        {
            System.out.println("Я не куплю это");
        }

        // использование тернарного оператора ?
        int result1  = (money > price) ? money : price;
        System.out.println("Результат : " + result1);

        String result2  = (money > price) ? "Я смогу купить это" : "Я не куплю это";
        System.out.println("Результат : " + result2);

    }

}
