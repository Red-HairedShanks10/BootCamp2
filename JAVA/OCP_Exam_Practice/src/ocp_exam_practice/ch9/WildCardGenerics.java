package ocp_exam_practice.ch9;
import java.util.*;

public class WildCardGenerics {
    public static void printList(List<?> list) {
        for (Object x: list)
            System.out.println(x);
    }

    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");

        List<Object> objects = new ArrayList<>();
        objects.add(new Object());

        printList(keywords);
        printList(objects);
    }

}

class UpperBoundedWildcards{
    public static long total(List<? extends Number> list) {
        long count = 0;
        for (Number number: list)
            count += number.longValue();
        return count;
    }

    public static void main(String[] args) {
        List<? extends Number> list = new ArrayList<Integer>();
        List<? extends Number> list2 = new ArrayList<Double>();


        System.out.println(list);
        System.out.println(list2);
    }
}