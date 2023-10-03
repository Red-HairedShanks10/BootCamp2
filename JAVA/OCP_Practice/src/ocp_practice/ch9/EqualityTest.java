package ocp_practice.ch9;

import java.util.*;

public class EqualityTest {
    public static void main(String[] args) {
        var list1 = List.of(1, 2);
         var list2 = List.of(2, 1);
         var set1 = Set.of(1, 2);
         var set2 = Set.of(2, 1);

        System.out.println(list1.equals(list2));//false becoz arrangement of values is different
         System.out.println(set1.equals(set2));//true bcoz same type of set even if order is different
         System.out.println(list1.equals(set1));//false, bcoz collection types are different
    }
}
