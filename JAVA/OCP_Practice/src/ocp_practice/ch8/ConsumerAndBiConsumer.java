package ocp_practice.ch8;

public class ConsumerAndBiConsumer {
}

interface Consumer<T> {
    void accept(T t);
}

interface BiConsumer<T, U>{
    void accept(T t, U u);

}