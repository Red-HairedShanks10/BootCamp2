package ocp_exam_practice.ch10;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupTesting {
    public static void main(String[] args) {

        var ohMy = Stream.of("lions", "tigers", "bears", "Honey Badger", "Rock Python");
      /*  Map<Integer, Set<String>> map = ohMy.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.toSet()));

        System.out.println(map);*/

        /////TreeMap
      /*  TreeMap<Integer, Set<String>> map2 = ohMy.collect(
              Collectors.groupingBy(
                      String::length,
                      TreeMap::new,
                      Collectors.toSet()));
        System.out.println(map2);*/


       /* TreeMap<Integer, List<String>> map3 = ohMy.collect(
                Collectors.groupingBy(
                        String::length,
                        TreeMap::new,
                        Collectors.toList()));
        System.out.println(map3);*/

        TreeMap<Integer, List<String>> map4 = ohMy.collect(
                Collectors.groupingBy(
                        String::length,
                        TreeMap::new,
                        Collectors.toList()));
        System.out.println(map4);


    }
}
