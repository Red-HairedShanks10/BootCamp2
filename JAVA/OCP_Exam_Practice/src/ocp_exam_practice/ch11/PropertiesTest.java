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

        Locale.setDefault(new Locale("en", "US"));
        12: Locale locale = new Locale("en", "CA");
        13: ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
        14: System.out.print(rb.getString("hello"));
        15: System.out.print(". ");
        16: System.out.print(rb.getString("name"));
        17: System.out.print(" ");
         System.out.print(rb.getString("open"));
         System.out.print(" ");
         System.out.print(rb.getString("visitors"));

    //printWelcomeMessage(us);
   // printWelcomeMessage(fr);
    }


     public static void printWelcomeMessage(Locale locale) {
        var rb = ResourceBundle.getBundle("Zoo", locale);
         System.out.println(rb.getString("hello")
                 + ", " + rb.getString("open"));
         }
}
