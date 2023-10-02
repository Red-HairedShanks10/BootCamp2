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



    }
}



interface Predicate<T>{
    boolean test(T t);
}

interface BiPredicate<T, U>{
    boolean test(T t, U u);
}

