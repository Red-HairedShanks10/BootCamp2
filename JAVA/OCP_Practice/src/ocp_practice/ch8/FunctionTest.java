package ocp_practice.ch8;

public class FunctionTest {
    public static void main(String[] args) {
        //using Function interface
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();
        //
        System.out.println(f1.apply("fleet"));
        System.out.println(f2.apply(""));

        //using BiFunction:
        BiFunction<String, String, String> b1 = String::concat;
        BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);
        //
        System.out.println(b1.apply("b1 ", "chick"));
        System.out.println(b2.apply("b2 ", "chick"));

    }

}




interface Function<T,R>{
    //Type T value returned by t will be converted to Value of Type R
    R apply(T t);
}

interface BiFunction<T,U, R>{
    R apply(T t, U u);
}
