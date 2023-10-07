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

        /*var originalBag = Stream.iterate(1, n -> ++n)
                .spliterator();
        Spliterator<Integer> newBag = originalBag.trySplit();
        newBag.tryAdvance(System.out::print);
        newBag.tryAdvance(System.out::print);
        newBag.tryAdvance(System.out::print);*/

        var ohMy = Stream.of("lions", "tigers", "bears");
        //  String result = ohMy.collect(Collectors.joining(", "));
       //System.out.println(result);

        var ohMyPanthera = Stream.of("Tigers", "Lions", "Jaguar");
        Double result2 = ohMyPanthera.collect(Collectors.averagingInt(String::length));
        System.out.println(result2);

        var ohMyRandoms = Stream.of("badger", "black Mamba", "jackal", "tiger", "taipan");
        /*TreeSet<String> result3 = ohMyRandoms
                .filter(s -> s.startsWith("t"))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(result3);*/

        //var ohMyRandoms = Stream.of("badger", "black Mamba", "jackal", "tiger", "taipan");
        Map<String, Integer> result4 = ohMyRandoms
                .collect(Collectors.toMap(s -> s, String::length));

        System.out.println(result4);


        Map<Integer, String> map = ohMy.collect(Collectors.toMap(
                String::length, k -> k,
                (s1, s2) -> s1 + "," + s2));
        System.out.println(map);
        System.out.println(map.getClass());

    }
}
