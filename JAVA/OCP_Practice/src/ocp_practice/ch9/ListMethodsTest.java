package ocp_practice.ch9;
import java.util.*;
public class ListMethodsTest {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
         list.add("SD");
         list.add(0, "NY");
        list.set(1, "FL");
        System.out.println(list.get(0));
         list.remove("NY");
         list.remove(0);
        list.set(0, "?");
    }
}
