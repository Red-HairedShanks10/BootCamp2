package ocp_exam_practice.ch10.finiteStreams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FiniteStreamTest {
    public static void main(String[] args) {
        Stream<String> empty = Stream.empty();
        Stream<Integer> singleElement = Stream.of(1);
         Stream<Integer> fromArray = Stream.of(1, 2, 3);

        var list = List.of("a", "b", "c");
         Stream<String> fromList = list.stream();

         Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
         System.out.println(s.count());

        Stream<String> sa = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = sa.min((s1, s2) ->
                s1.length()-s2.length());min.ifPresent(System.out::println);

        Stream<String> sb = Stream.of("monkey", "ape", "bonobo");
        Optional<String> max = sb.min((s1, s2) ->
                s1.length()-s2.length());max.ifPresent(System.out::println);
    }
}
