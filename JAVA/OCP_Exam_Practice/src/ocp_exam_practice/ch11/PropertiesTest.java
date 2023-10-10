package ocp_exam_practice.ch11;

import java.util.Locale;
import java.util.ResourceBundle;

public class PropertiesTest {
    public static void main(String[] args) {
   /* var us = new Locale("en", "US");
    var fr = new Locale("fr", "FR");

   ResourceBundle resourceBundle = ResourceBundle.getBundle("Zoo", fr);
    resourceBundle.keySet().stream()
                    .map(k -> k + ": " + resourceBundle.getString(k))
                            .forEach(System.out::println);*/

    //printWelcomeMessage(us);
   // printWelcomeMessage(fr);
    }


     public static void printWelcomeMessage(Locale locale) {
        var rb = ResourceBundle.getBundle("Zoo", locale);
         System.out.println(rb.getString("hello")
                 + ", " + rb.getString("open"));
         }
}
