package ocp_exam_practice.ch10;

import java.util.ArrayList;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AdvancedStreams {
        public static void main(String[] args) {

           /* var cats = new ArrayList<String>();
             cats.add("Tora");
             cats.add("Leo");
             var stream = cats.stream();
             cats.add("Jaggy");
             System.out.println(stream.count());*/

            Stream<Integer> intStream = Stream.of(100,200,100);
          //  OptionalInt max;
            Optional<Integer> ints = intStream.max((n, n2) -> n - n2);

            Optional<String> optional = Optional.of("123");
            Optional<Integer> result = optional.map(e -> e.length());

              //  System.out.println(result);
           // threeDigit(ints);

           // Optional.of("345").flatMap(String::length).stream().forEach();

            threeDigit(result);

        }


    private static void threeDigit(Optional<Integer> optional){
        optional.map(n -> "" + n).ifPresent(System.out::println);
             //   .filter(s -> s.length() == 3)
    }
}
