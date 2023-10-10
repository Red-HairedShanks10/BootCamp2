package ocp_exam_practice.ch11;

import java.time.format.DateTimeFormatter;

public class Formating {
    public static void main(String[] args) {

        var f1 = DateTimeFormatter.ofPattern("MMMM dd, yyyy ");
        var f2 = DateTimeFormatter.ofPattern(" hh:mm");
        System.out.println(dt.format(f1) + "at" + dt.format(f2));
    }
}
