package ocp_exam_practice.ch10;
import java.util.stream.*;
import java.util.*;

public class SpliteratorTest {
    public static void main(String[] args) {

        /*var stream = List.of("bird-",
                "bunny-",
                "cat-",
                "dog-",
                "fish-",
                "lamb-",
                "mouse-");
        Spliterator<String> originalBagOfFood = stream.spliterator();
        Spliterator<String> emmasBag = originalBagOfFood.trySplit();
        emmasBag.forEachRemaining(System.out::println);

        Spliterator<String> jillsBag = originalBagOfFood.trySplit();
        jillsBag.tryAdvance(System.out::println);
        jillsBag.forEachRemaining(System.out::println);
        originalBagOfFood.forEachRemaining(System.out::println);*/

        var originalBag = Stream.iterate(1, n -> ++n)
                .spliterator();
        Spliterator<Integer> newBag = originalBag.trySplit();
        newBag.tryAdvance(System.out::print); 
        newBag.tryAdvance(System.out::print);
        newBag.tryAdvance(System.out::print);

    }
}
