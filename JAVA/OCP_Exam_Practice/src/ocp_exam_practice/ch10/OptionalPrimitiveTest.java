package ocp_exam_practice.ch10;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class OptionalPrimitiveTest {
    public static void main(String[] args) {
        long sum = longs.sum();
         System.out.println(sum); // 15
         DoubleStream doubles = DoubleStream.generate(() ->
                Math.PI);
         OptionalDouble min = doubles.min(); // runs infinitely
    }
}
