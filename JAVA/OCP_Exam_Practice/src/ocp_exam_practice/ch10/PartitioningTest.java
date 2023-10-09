package ocp_exam_practice.ch10;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitioningTest {
    public static void main(String[] args) {

        var ohMy = Stream.of("lions", "tigers", "jaguars", "bears");
        Map<Boolean, List<String>> map = ohMy.collect(
                Collectors.partitioningBy(s -> s.length() <= 7));
        System.out.println(map);
    }
}
