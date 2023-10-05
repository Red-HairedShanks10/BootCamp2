package ocp_exam_practice.ch9;
import java.util.*;


public class UnboundedWildcards {
    public static void printList(List<Object> list) {
        for (Object x: list)
            System.out.println(x);
    }




    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
       // printList(keywords); // DOES NOT COMPILE
    }
}
