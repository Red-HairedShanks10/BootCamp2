package ocp_exam_practice.ch11;

public class PropertiesTest {
    public static void main(String[] args) {

    }


    10: public static void printWelcomeMessage(Locale locale) {
        11: var rb = ResourceBundle.getBundle("Zoo", locale);
        12: System.out.println(rb.getString("hello")
                13: + ", " + rb.getString("open"));
         }
}
