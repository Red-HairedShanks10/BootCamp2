package ocp_exam_practice.ch10;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class OptionalPrimitiveTest {
    public static void main(String[] args) {
       /* LongStream longs = LongStream.of(5,10);
        long sum = longs.sum();
         System.out.println(sum);
         DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
         OptionalDouble min = doubles.min();

         DoubleStream stream = DoubleStream.generate(() -> Math.PI);
                 stream.min();*/

        IntStream intStream = IntStream.of(1,2,3,5);
        IntStream intStream2 = IntStream.of();
     /*   System.out.println(max(intStream));
        System.out.println(max(intStream2));*/


    }

    private static int max(IntStream ints) {
        OptionalInt optional = ints.max();
        return optional.orElseThrow(RuntimeException::new);
    }



    private static int range(IntStream ints) {
        IntSummaryStatistics stats = ints.summaryStatistics();
        if (stats.getCount() == 0) throw new RuntimeException();
        return stats.getMax()-stats.getMin();
    }
}
