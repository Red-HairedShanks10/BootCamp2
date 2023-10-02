package ocp_practice.ch8;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;
public class MethodsTest {
    public static void main(String[] args) {
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");

        Predicate<String> brownEggs = egg.and(brown);
        Predicate<String> otherEggs = egg.and(brown.negate());

        System.out.println(brownEggs.test("brown eggs"));
        System.out.println(otherEggs.test("scrambled eggs"));

        Consumer<String> c1 = x -> System.out.println("1: " + x);
        Consumer<String> c2 = x -> System.out.println("2: " + x);

        Consumer<String> combined = c1.andThen(c2);
        combined.accept("Tiger ");

        Function<Integer, Integer> result1 = x -> x + 100;
        Function<Integer, Integer> result2 = x -> x * 2;

        Function<Integer, Integer> combined2 = result2.compose(result1);//whatever is inside compose(), will be done first
        System.out.println(combined2.apply(30));

    }
}
