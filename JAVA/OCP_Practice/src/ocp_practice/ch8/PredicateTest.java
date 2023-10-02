package ocp_practice.ch8;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();
    }
}



interface Predicate<T>{
    boolean test(T t);
}
