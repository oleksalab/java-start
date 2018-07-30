package Lesson07;

import java.util.Formatter;

public class Lesson07Ex05 {

    public static void main(String[] args) {

        Formatter form = new Formatter();
        form.format("%.6f", Math.E);

        String text = form.toString();
        System.out.println(text);

        form.close();
    }
}
