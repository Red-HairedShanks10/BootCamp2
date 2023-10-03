package ocp_practice.ch9;
import java.util.*;
public class ListMethodsTest {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        4: list.add("SD"); // [SD]
        5: list.add(0, "NY"); // [NY,SD]
        6: list.set(1, "FL"); // [NY,FL]
        7: System.out.println(list.get(0)); // NY
        8: list.remove("NY"); // [FL]
        9: list.remove(0); // []
        list.set(0, "?"); // IndexOutOfBoundsException
    }
}
