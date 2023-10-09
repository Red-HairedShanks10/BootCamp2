package ocp_exam_practice.ch10;

import java.util.List;
import java.util.stream.Stream;

public class GroupTesting {
    public static void main(String[] args) {
        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> map = ohMy.collect(
                Collectors.groupingBy(String::length));
    }
}
