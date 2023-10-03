package ocp_practice.ch9;
import java.util.*;

public class SetMethodsTest {
    public static void main(String[] args) {

        //HashSet
         Set<Integer> hashSet = new HashSet<>();
        boolean b1 = hashSet.add(66);
        boolean b2 = hashSet.add(10);
         boolean b3 = hashSet.add(66);
         boolean b4 = hashSet.add(8);
        hashSet.forEach(System.out::println);


        //TreeSet
        Set<Integer> set = new TreeSet<>();
        boolean b1 = set.add(66);
        boolean b2 = set.add(10);
        boolean b3 = set.add(66);
        boolean b4 = set.add(8);
        set.forEach(System.out::println);
    }
}
