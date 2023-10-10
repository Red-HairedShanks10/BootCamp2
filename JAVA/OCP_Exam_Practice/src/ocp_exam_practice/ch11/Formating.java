package ocp_exam_practice.ch11;

import  static java.text.NumberFormat.*;

import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.stream.Stream;
import static java.time.format.FormatStyle.*;


public class Formating {
    public static void main(String[] args) {

      //  var dt = LocalDateTime.of(2022, Month.OCTOBER, 20, 6, 15, 30);
/*
        var f1 = DateTimeFormatter.ofPattern("MMMM dd, yyyy ");
        var f2 = DateTimeFormatter.ofPattern(" hh:mm");
        System.out.println(dt.format(f1) + "at" + dt.format(f2));*/

        /*var g1 = DateTimeFormatter.ofPattern("MMMM dd', Party''s at' hh:mm");
        System.out.println(dt.format(g1));*/

        /*Locale locale = Locale.getDefault();
        System.out.println(locale);*/
/*
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
        int attendeesPerMonth = attendeesPerYear / 12;*/

        /*var us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(attendeesPerMonth));
        var gr = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(gr.format(attendeesPerMonth));
        var za = NumberFormat.getInstance();
        System.out.println(za.format(attendeesPerMonth));

*/
        /*double price = 48;
        var myLocale = NumberFormat.getCurrencyInstance();
        System.out.println(myLocale.format(price));


        var grLocal = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        System.out.println(grLocal.format(price));

        var jpLocal = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        System.out.println(jpLocal.format(price));

        double successRate = 0.802;

        var za = NumberFormat.getPercentInstance();
        System.out.println(za.format(successRate));

        var us = NumberFormat.getPercentInstance(Locale.US);
        System.out.println(us.format(successRate));

        var gr = NumberFormat.getPercentInstance(Locale.GERMANY);
        System.out.println(gr.format(successRate));


        try{
            String s = "40.45";
            var en = NumberFormat.getInstance(Locale.US);
            System.out.println(en.parse(s));
        }catch (ParseException e){
            System.out.println(e);
        }

        try{
            String income = "$92,807.99";
            var cf = NumberFormat.getCurrencyInstance(Locale.US);
            double value = (Double) cf.parse(income);
            System.out.println(value);
        }catch (ParseException e){
            System.out.println(e);
        }*/



      /*  var formatters = Stream.of(getCompactNumberInstance(),
                getCompactNumberInstance(Locale.getDefault(), Style.SHORT),
                getCompactNumberInstance(Locale.getDefault(), Style.LONG),
                getCompactNumberInstance(Locale.GERMAN, Style.SHORT),
                getCompactNumberInstance(Locale.GERMAN, Style.LONG),
                getNumberInstance());
            formatters.map(s -> s.format(745_123_456)).forEach(System.out::println);
*/

        Locale.setDefault(new Locale("en", "US"));
        var italy = new Locale("it", "IT");
        var dt = LocalDateTime.of(2022, Month.OCTOBER, 20, 15, 12, 34);

        print(DateTimeFormatter.ofLocalizedDate(SHORT),dt,italy);

        print(DateTimeFormatter.ofLocalizedTime(SHORT),dt,italy);

        print(DateTimeFormatter.ofLocalizedDateTime(SHORT,SHORT),dt,italy);


        var spain = new Locale("es", "ES");
    }


    public static void print(DateTimeFormatter dtf, LocalDateTime dateTime, Locale locale){
        System.out.println(dtf.format(dateTime) + "---"
                + dtf.withLocale(locale).format(dateTime));
    }

    public static void printCurrency(Locale locale, double money) {
        System.out.println(NumberFormat.getCurrencyInstance().format(money)
         + ", " + locale.getDisplayLanguage());
         }



}
