package ocp_exam_practice.ch11;

public class PropertiesTest {
    public static void main(String[] args) {

    }


    10: public static void printWelcomeMessage(Locale locale) {
        var rb = ResourceBundle.getBundle("Zoo", locale);
        12: System.out.println(rb.getString("hello")
                 + ", " + rb.getString("open"));
         }
}
