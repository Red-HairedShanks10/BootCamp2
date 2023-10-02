package ocp_practice.ch8;
import java.util.function.Predicate;
import java.util.function.Consumer;
public class MethodsTest {
    public static void main(String[] args) {
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");

        Predicate<String> brownEggs = egg.and(brown);
        Predicate<String> otherEggs = egg.and(brown.negate());

        System.out.println(brownEggs.test("brown eggs"));
        System.out.println(otherEggs.test("scrambled eggs"));

        Consumer<String> c1 = x -> System.out.print("1: " + x);
        Consumer<String> c2 = x -> System.out.print("2: " + x);

        Consumer<String> combined = c1.andThen(c2);
        combined.accept("Tiger ");
    }
}
