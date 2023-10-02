package ocp_practice.ch8;
import java.util.function.*;
public class MethodsTest {
    public static void main(String[] args) {
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");

            Predicate<String> brownEggs = egg.and(brown);
    }
}
