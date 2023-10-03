package ocp_practice.ch9;
import java.util.*;

public class SetMethodsTest {
    public static void main(String[] args) {

        //HashSet
         Set<Integer> set = new HashSet<>();
        boolean b1 = set.add(66);
        boolean b2 = set.add(10);
         boolean b3 = set.add(66);
         boolean b4 = set.add(8);
        set.forEach(System.out::println);


        //TreeSet
        3: Set<Integer> set = new TreeSet<>();
        4: boolean b1 = set.add(66); // true
        5: boolean b2 = set.add(10); // true
        6: boolean b3 = set.add(66); // false
         boolean b4 = set.add(8); // true
         set.forEach(System.out::println);
    }
}
