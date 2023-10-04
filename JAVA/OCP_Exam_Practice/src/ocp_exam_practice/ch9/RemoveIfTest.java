package ocp_exam_practice.ch9;

import java.util.*;


public class RemoveIfTest {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("Magician");
        list.add("Assistant");
        System.out.println(list);
        list.removeIf(s -> s.startsWith("A"));
        System.out.println(list);

        Collection<String> set = new HashSet<>();
        set.add("wand");
        set.add("");
        set.removeIf(String::isEmpty);
        System.out.println(set);
    }
}
