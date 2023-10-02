package ocp_practice.ch8;

public class PredicateTest {
    public static void main(String[] args) {
        //Testing Predicate
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();
        //
        System.out.println(p1.test(""));
        System.out.println(p2.test(""));

        //BiPredicate:
        BiPredicate<String, String> b1 = String::startsWith;
        BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);
        //
        System.out.println(b1.test("chicken", "chick"));
        System.out.println(b2.test("chicken", "chick"));
    }
}



interface Predicate<T>{
    boolean test(T t);
}

interface BiPredicate<T, U>{
    boolean test(T t, U u);
}

