package ocp_exam_practice.ch10;

import java.util.List;
import java.util.stream.Stream;

public class FlatMapping {
    public static void main(String[] args) {

        var one = List.of("Bonobo");
        var two = List.of("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);
        animals.flatMap(m -> m.stream()).forEach(System.out::println);
    }
}
