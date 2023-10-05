package ocp_exam_practice.ch10.ReducingStreams;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReducingStreams {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("w","o", "l", "f");
       // String word = stream.reduce("", (s,c) -> s + c );
       String word = stream.reduce("", String::concat);
        System.out.println(word);

        Stream<Integer> numStream = Stream.of(3, 5, 6);
        int nStream = numStream.reduce(1, (a,b) -> a*b);
        System.out.println(nStream);

        ///////////////////////////

        BinaryOperator<Integer> op = (a, b) -> a * b;
        
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3, 5, 6);
        empty.reduce(op).ifPresent(System.out::println);
        oneElement.reduce(op).ifPresent(System.out::println);
        threeElements.reduce(op).ifPresent(System.out::println);

    }
}
