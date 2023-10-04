package ocp_exam_practice.ch9;
import java.util.*;
public class ListToArray {
    public static void main(String[] args) {

         List<String> list = new ArrayList<>();
         list.add("hawk");
         list.add("Crow");
        list.add("Great Horn Owl");
         Object[] objectArray = list.toArray();
         String[] stringArray = list.toArray(new String[0]);
         list.clear();
        System.out.println(objectArray.length);
         System.out.println(stringArray.length);
        System.out.println("printing cleared list: " + list);
    }
}
