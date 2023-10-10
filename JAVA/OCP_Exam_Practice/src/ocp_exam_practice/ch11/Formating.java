package ocp_exam_practice.ch11;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Formating {
    public static void main(String[] args) {

        var dt = LocalDateTime.of(2022, Month.OCTOBER, 20, 6, 15, 30);
/*
        var f1 = DateTimeFormatter.ofPattern("MMMM dd, yyyy ");
        var f2 = DateTimeFormatter.ofPattern(" hh:mm");
        System.out.println(dt.format(f1) + "at" + dt.format(f2));*/

        /*var g1 = DateTimeFormatter.ofPattern("MMMM dd', Party''s at' hh:mm");
        System.out.println(dt.format(g1));*/

        /*Locale locale = Locale.getDefault();
        System.out.println(locale);*/

        System.out.println(Locale.GERMAN); // de
        System.out.println(Locale.JAPAN); // de_DE
    }
}
