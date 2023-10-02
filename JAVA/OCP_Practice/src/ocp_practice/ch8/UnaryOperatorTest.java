package ocp_practice.ch8;

public class UnaryOperatorTest {
}

 interface UnaryOperator<T> extends Function<T, T> {
  T apply(T t);
}
