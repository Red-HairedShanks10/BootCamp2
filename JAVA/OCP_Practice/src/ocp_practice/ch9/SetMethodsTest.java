package ocp_practice.ch9;
import java.util.*;

public class SetMethodsTest {
    public static void main(String[] args) {

        Set<Character> letters = Set.of('z', 'o');//wont allow duplicate values
        Set<Character> copy = Set.copyOf(letters);
        System.out.println(letters);
        System.out.println(copy);

        //HashSet
         Set<Integer> hashSet = new HashSet<>();
        boolean h1 = hashSet.add(66);
        boolean h2 = hashSet.add(10);
         boolean h3 = hashSet.add(66);
         boolean h4 = hashSet.add(8);
         System.out.println("Hashset: ");
        hashSet.forEach(System.out::println);
        System.out.println("///////////");

        //TreeSet
        Set<Integer> treeSet = new TreeSet<>();
        boolean t1 = treeSet.add(66);
        boolean t2 = treeSet.add(10);
        boolean t3 = treeSet.add(66);
        boolean t4 = treeSet.add(8);
        System.out.println("Treeset: ");
        treeSet.forEach(System.out::println);
    }
}
