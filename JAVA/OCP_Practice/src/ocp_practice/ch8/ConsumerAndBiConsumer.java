package ocp_practice.ch8;

public class ConsumerAndBiConsumer {
    public static void main(String[] args) {

    }
}

interface Consumer<T> {
    void accept(T t);
}

interface BiConsumer<T, U>{
    void accept(T t, U u);

}