package ocp_exam_practice.ch10;

import java.util.List;
import java.util.stream.Stream;

public class FlatMapping {
    public static void main(String[] args) {

        List<String> zero = List.of();

        var one = List.of("Bonobo");
        var two = List.of("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);
        System.out.println("FlatMap concat: ");
        animals.flatMap(m -> m.stream()).forEach(System.out::println);
        System.out.println("//////////////////////");

        ///other way to concatenate strings:
        var oneString = Stream.of("Bonobo");
        var twoStrings = Stream.of("Mama Gorilla", "Baby Gorilla");
        System.out.println("Stream.concat(): ");
        Stream.concat(oneString,twoStrings).forEach(System.out::println);
    }
}
