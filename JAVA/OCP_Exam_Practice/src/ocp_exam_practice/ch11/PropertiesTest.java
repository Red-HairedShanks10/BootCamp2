package ocp_exam_practice.ch11;

import java.text.MessageFormat;
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

       /* Locale.setDefault(new Locale("en", "US"));
         Locale locale = new Locale("en", "CA");
       //  Locale us = new Locale("en", "US");
         ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
         System.out.print(rb.getString("hello"));
         System.out.print(". ");
         System.out.print(rb.getString("name"));
         System.out.print(" ");
         System.out.print(rb.getString("open"));
         System.out.print(" ");
         System.out.print(rb.getString("visitors"));*/

        Locale.setDefault(new Locale("en", "US"));
        Locale locale = new Locale("en", "CA");
    ResourceBundle rb = ResourceBundle.getBundle("Zoo",locale);

        String format = rb.getString("helloByName");
        System.out.print(MessageFormat.format(format, "Tammy", "Henry"));
    //printWelcomeMessage(us);
   // printWelcomeMessage(fr);
    }


     public static void printWelcomeMessage(Locale locale) {
        var rb = ResourceBundle.getBundle("Zoo", locale);
         System.out.println(rb.getString("hello")
                 + ", " + rb.getString("open"));
         }
}
