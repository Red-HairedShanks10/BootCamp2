package ocp_exam_practice.ch10;

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
         emmasBag.forEachRemaining(System.out::print); // bird-bunny-
        cat-

         Spliterator<String> jillsBag = originalBagOfFood.trySplit();
        jillsBag.tryAdvance(System.out::print); // dog-20:
        jillsBag.forEachRemaining(System.out::print); // fish-21:
        originalBagOfFood.forEachRemaining(System.out::print); // lamb-mouse-

    }
}
