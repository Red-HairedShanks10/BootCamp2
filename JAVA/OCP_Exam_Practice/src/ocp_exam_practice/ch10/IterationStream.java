package ocp_exam_practice.ch10;

import java.util.stream.Stream;

public class IterationStream {
    public static void main(String[] args) {

        Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
        s.forEach(System.out::print); 
    }
}
