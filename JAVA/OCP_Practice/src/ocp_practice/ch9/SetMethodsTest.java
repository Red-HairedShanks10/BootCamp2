package ocp_practice.ch9;
import java.util.*;

public class SetMethodsTest {
    public static void main(String[] args) {

        3: Set<Integer> set = new HashSet<>();
        4: boolean b1 = set.add(66); // true
        boolean b2 = set.add(10); // true
         boolean b3 = set.add(66); // false
         boolean b4 = set.add(8); // true
        set.forEach(System.out::println);
    }
}
