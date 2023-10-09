package ocp_exam_practice.ch10;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitioningTest {
    public static void main(String[] args) {

        var ohMy = Stream.of("lions", "tigers", "jaguars", "bears");
        /*Map<Boolean, List<String>> map = ohMy.collect(
                Collectors.partitioningBy(s -> s.length() <= 7));
        System.out.println(map);*/


        /*Map<Boolean, Set<String>> map2 = ohMy.collect(
                Collectors.partitioningBy(
                        s -> s.length() <= 7,
                        Collectors.toSet()));
        System.out.println(map2);*/


        //grouping animal name lengths by the counting()
        Map<Integer, Long> map3 = ohMy.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.counting()));
        System.out.println(map3);

        




    }
}
