package ocp_exam_practice.ch10;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortingStreams {
    public static void main(String[] args) {

        Stream<String> s = Stream.of("brown-", "bear-");
        s.sorted().forEach(System.out::print);

        Stream<String> s = Stream.of("brown bear-",
                "grizzly-");
        s.sorted(Comparator.reverseOrder()).forEach(System.out::print);
    }
}
