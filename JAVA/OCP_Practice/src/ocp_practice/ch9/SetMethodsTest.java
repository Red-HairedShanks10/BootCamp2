package ocp_practice.ch9;
import java.util.*;

public class SetMethodsTest {
    public static void main(String[] args) {

        3: Set<Integer> set = new HashSet<>();
        4: boolean b1 = set.add(66); // true
        5: boolean b2 = set.add(10); // true
        6: boolean b3 = set.add(66); // false
        7: boolean b4 = set.add(8); // true
        set.forEach(System.out::println);
    }
}
