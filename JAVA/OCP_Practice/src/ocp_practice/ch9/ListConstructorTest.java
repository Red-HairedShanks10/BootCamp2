package ocp_practice.ch9;

import java.util.*;

public class ListConstructorTest {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        for (String s: strings) {
            System.out.println(s);
        }


        var list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("a");
        for (String s: list) { }
    }
}
