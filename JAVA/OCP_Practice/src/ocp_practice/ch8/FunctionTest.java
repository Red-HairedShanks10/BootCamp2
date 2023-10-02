package ocp_practice.ch8;

public class FunctionTest {
    public static void main(String[] args) {
        //using Function interface
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();

        System.out.println(f1.apply("cluck")); // 5
        System.out.println(f2.apply("cluck")); // 5
    }

}




interface Function<T,R>{
    //Type T value returned by t will be converted to Value of Type R
    R apply(T t);
}

interface BiFunction<T,U, R>{
    R apply(T t, U u);
}
