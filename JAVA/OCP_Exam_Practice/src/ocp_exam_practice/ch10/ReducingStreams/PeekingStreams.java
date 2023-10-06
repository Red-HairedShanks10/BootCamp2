package ocp_exam_practice.ch10.ReducingStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PeekingStreams {
    public static void main(String[] args) {
       /* var peekStream = Stream.of("black bear", "brown bear", "grizzly", "grey wolf");
        long countGbears = peekStream.filter(s -> s.startsWith("g"))
                .peek(System.out::println).count();
        System.out.println(countGbears);*/

        var numbers = new ArrayList<>();
        var letters = new ArrayList<>();

        numbers.add(1);
         numbers.add(2);
        numbers.add(5);

        letters.add('a');
       // letters.add('b');

        Stream<List<?>> pStream = Stream.of(numbers, letters);

        pStream.map(x -> x.size())
                .peek(System.out::println)
                .forEach(System.out::println);

       /* Stream<List<?>> bad = Stream.of(numbers, letters);
        bad.peek(x -> x.remove(0)).map(List::size)
                .forEach(System.out::println);*/
    }
}
