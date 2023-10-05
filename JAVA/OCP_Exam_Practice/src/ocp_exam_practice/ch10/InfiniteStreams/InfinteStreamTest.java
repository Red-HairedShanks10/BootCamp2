package ocp_exam_practice.ch10.InfiniteStreams;

import java.util.stream.Stream;

public class InfinteStreamTest {
    public static void main(String[] args) {
        Stream<Double> randoms = Stream.generate(Math::random);
         Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);

         System.out.println(oddNumbers);
    }
}
