package ocp_exam_practice.ch8;

import java.util.HashMap;

public class ConsumerAndBiConsumer {
    public static void main(String[] args) {
       /* //Consumer interface
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);
        //
        c1.accept("Kdot");
        c2.accept("Nas");
*/
        //BiConsumer Interface
        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);

        //interesting how generic interface methods adapt to the generic type specified
        //if BiConsumer b2 had different generic types specified will it still work?
        b1.accept("Messi", 10);
        b2.accept("Jude", 5);

        System.out.println(map);
    }
}

interface Consumer<T> {
    void accept(T t);

    Consumer<T> andThen(Consumer<T> c2);
}

interface BiConsumer<T, U>{
    void accept(T t, U u);

}