package ocp_exam_practice.ch10.ReducingStreams;

import java.util.stream.Stream;

public class ReducingStreams {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("w","o", "l", "f");
       // String word = stream.reduce("", (s,c) -> s + c );
       String word = stream.reduce("", String::concat);
        System.out.println(word);
    }
}
