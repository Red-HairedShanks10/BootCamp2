package ocp_exam_practice.ch10;

import java.util.Optional;

public class OptionalTest {

    public static Optional<Double> average(int... scores) {
        if (scores.length == 0){ return Optional.empty();}
       int sum = 0;
        for (int score: scores){ sum += score;}

        Optional o = (scores.length == 0 ) ? Optional.empty() : Optional.of((double)sum/scores.length);
        return o;
         }



    public static void main(String[] args) {
        Optional<Double> opt = average(90, 100,56,80);
        opt.ifPresent(System.out::println);

       /* if (opt.isPresent()) {
            System.out.println(opt.get());
        }else {
            System.out.println("Not opt");
        }*/

        Optional<Double> opt2 = average();
       // Optional o = Optional.ofNullable(opt2);
        Optional o = (opt2 == null) ? Optional.empty() : Optional.of(opt2);
        opt2.ifPresent(System.out::println);
        //System.out.println("opt 2 issue: " + opt2);

      /*  if (opt2.isPresent()) {
            System.out.println(opt2.get());
        }else {
            System.out.println("opt 2 issue: " + opt2);
        }*/

        Optional<Double> opt3 = average();
         System.out.println(opt3.orElse(Double.NaN));
         System.out.println(opt3.orElseGet(() -> Math.random()));

        Optional<Double> opt4 = average();
         System.out.println(opt4.orElseThrow());
    }
}
