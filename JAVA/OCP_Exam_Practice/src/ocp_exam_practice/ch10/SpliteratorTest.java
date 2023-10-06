package ocp_exam_practice.ch10;

public class SpliteratorTest {
    public static void main(String[] args) {

        var stream = List.of("bird-",
                "bunny-",
                "cat-",
                "dog-",
                "fish-",
                "lamb-",
                13: "mouse-");
        14: Spliterator<String> originalBagOfFood = stream.spliterator();
        15: Spliterator<String> emmasBag = originalBagOfFood.trySplit();
        16: emmasBag.forEachRemaining(System.out::print); // bird-bunny-
        cat-
                17:
        18: Spliterator<String> jillsBag = originalBagOfFood.trySplit();
        19: jillsBag.tryAdvance(System.out::print); // dog-20:
        jillsBag.forEachRemaining(System.out::print); // fish-21:
        originalBagOfFood.forEachRemaining(System.out::print); // lamb-mouse-

    }
}
