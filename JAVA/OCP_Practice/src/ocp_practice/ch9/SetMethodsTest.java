package ocp_practice.ch9;
import java.util.*;

public class SetMethodsTest {
    public static void main(String[] args) {

        //HashSet
         Set<Integer> hashSet = new HashSet<>();
        boolean h1 = hashSet.add(66);
        boolean h2 = hashSet.add(10);
         boolean h3 = hashSet.add(66);
         boolean h4 = hashSet.add(8);
        hashSet.forEach(System.out::println);


        //TreeSet
        Set<Integer> treeSet = new TreeSet<>();
        boolean t1 = treeSet.add(66);
        boolean t2 = treeSet.add(10);
        boolean t3 = treeSet.add(66);
        boolean t4 = treeSet.add(8);
        treeSet.forEach(System.out::println);
    }
}
