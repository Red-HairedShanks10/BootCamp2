package ocp_practice.ch9;

import java.util.*;

public class ListConstructorTest {
    public static void main(String[] args) {
        var linked1 = new LinkedList<String>();
        var linked2 = new LinkedList<String>(linked1);
    }
}
