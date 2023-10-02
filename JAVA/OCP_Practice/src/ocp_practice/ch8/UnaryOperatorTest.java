package ocp_practice.ch8;

public class UnaryOperatorTest {
 UnaryOperator<String> u1 = String::toUpperCase;
 UnaryOperator<String> u2 = x -> x.toUpperCase();

}

 interface UnaryOperator<T> extends Function<T, T> {
  T apply(T t);
}

 interface BinaryOperator<T> extends BiFunction<T, T, T> {
  T apply(T t1, T t2);
}