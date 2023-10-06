package ocp_exam_practice.ch10;

import java.util.*;

public class SpliteratorTest {
    public static void main(String[] args) {

        var stream = List.of("bird-",
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
        jillsBag.tryAdvance(System.out::print);
        jillsBag.forEachRemaining(System.out::print);
        originalBagOfFood.forEachRemaining(System.out::print);

    }
}
