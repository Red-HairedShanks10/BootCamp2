package ocp_practice.ch8;

public class UnaryOperatorTest {

 public static void main(String[] args) {
//Applying UnaryOp.. interface
  UnaryOperator<String> u1 = String::toUpperCase;
  UnaryOperator<String> u2 = x -> x.toUpperCase();
  //
  System.out.println(u1.apply("chirp"));
  System.out.println(u2.apply("chirp"));

  //Applying BinaryOp..
  BinaryOperator<String> b1 = String::concat;
  BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);
  //
  System.out.println(b1.apply("baby ", "chick")); // baby chick
  System.out.println(b2.apply("baby ", "chick"));
 }


}

 interface UnaryOperator<T> extends Function<T, T> {
  T apply(T t);
}

 interface BinaryOperator<T> extends BiFunction<T, T, T> {
  T apply(T t1, T t2);
}