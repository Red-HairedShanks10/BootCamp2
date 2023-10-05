package ocp_exam_practice.ch10.finiteStreams;

import java.util.stream.Stream;

public class FiniteStreamTest {
    public static void main(String[] args) {
        Stream<String> empty = Stream.empty(); // count = 0
        Stream<Integer> singleElement = Stream.of(1); // count = 1
         Stream<Integer> fromArray = Stream.of(1, 2, 3); // count = 3
    }
}
