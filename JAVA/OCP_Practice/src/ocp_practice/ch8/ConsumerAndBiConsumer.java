package ocp_practice.ch8;

public class ConsumerAndBiConsumer {
    public static void main(String[] args) {
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);
    }
}

interface Consumer<T> {
    void accept(T t);
}

interface BiConsumer<T, U>{
    void accept(T t, U u);

}