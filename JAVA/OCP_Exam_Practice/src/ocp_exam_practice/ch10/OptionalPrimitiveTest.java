package ocp_exam_practice.ch10;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class OptionalPrimitiveTest {
    public static void main(String[] args) {
        LongStream longs = LongStream.of(5,10);
        long sum = longs.sum();
         System.out.println(sum);
         DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
         OptionalDouble min = doubles.min();

         DoubleStream stream = DoubleStream.generate(() -> Math.PI);
                 stream.min();

    }

    private static int max(IntStream ints) {
        OptionalInt optional = ints.max();
        return optional.orElseThrow(RuntimeException::new);
    }
}
