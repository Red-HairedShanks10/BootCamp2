package ocp_practice.ch9;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        String[] array = new String[] {"a", "b", "c"};
         List<String> asList = Arrays.asList(array); 
        List<String> of = List.of(array); // [a, b, c]
         List<String> copy = List.copyOf(asList); // [a, b, c]
    }
}
