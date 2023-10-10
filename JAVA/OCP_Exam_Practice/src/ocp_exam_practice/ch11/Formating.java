package ocp_exam_practice.ch11;

import java.text.NumberFormat;
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

        System.out.println(Locale.GERMAN);
        System.out.println(Locale.JAPAN);

        Locale lang1 = new Locale.Builder()
                .setLanguage("pt")
                .setRegion("BR")
                .build();

        Locale lang2 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();

        System.out.println(lang1);
        System.out.println(lang2);


        int attendeesPerYear = 3_200_000;
        int attendeesPerMonth = attendeesPerYear / 12;

        var us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(attendeesPerMonth)); // 266,666
        var gr = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(gr.format(attendeesPerMonth));
        var za = NumberFormat.getInstance();
        System.out.println(za.format(attendeesPerMonth));
    }
}
