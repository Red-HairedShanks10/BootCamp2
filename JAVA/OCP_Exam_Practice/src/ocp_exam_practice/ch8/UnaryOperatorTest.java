package ocp_exam_practice.ch8;

public class UnaryOperatorTest {

 public static void main(String[] args) {
//Applying UnaryOp.. interface
  UnaryOperator<String> u1 = String::toUpperCase;
  UnaryOperator<String> u2 = x -> x.toUpperCase();
  //
  System.out.println(u1.apply("chirp"));
  System.out.println(u2.apply("roar"));

  UnaryOperator<Double> mr3 = a -> {return  Math.floor(a);};
  System.out.println(mr3.apply(3.5));



  //Applying BinaryOp..
  BinaryOperator<String> b1 = String::concat;
  BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);
  //
  System.out.println(b1.apply("blue ", "Orca"));
  System.out.println(b2.apply("Nile ", "croc"));


  BinaryOperator<Double> mr1 = Math::pow;
  BinaryOperator<Double> lambda1 = (d1,d2) -> Math.pow(d1, d2);
  System.out.println(lambda1.apply(2.4, 4.5));

  BinaryOperator<Integer> mr2 = Math::max;
  System.out.println(mr2.apply(2, 4));





 }


}

 interface UnaryOperator<T>  {
  T apply(T t);
}

 interface BinaryOperator<T>{
  T apply(T t1, T t2);
}