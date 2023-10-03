package ocp_practice.ch9;
import java.util.*;
public class ListMethodsTest {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
         list.add("SD"); 
         list.add(0, "NY"); // [NY,SD]
        list.set(1, "FL"); // [NY,FL]
        System.out.println(list.get(0)); // NY
         list.remove("NY"); // [FL]
         list.remove(0); // []
        list.set(0, "?"); // IndexOutOfBoundsException
    }
}
