package ocp_exam_practice.ch10;

import java.util.Optional;

public class OptionalTest {
    public static Optional<Double> average(int... scores) {
       /**/ if (scores.length == 0) return Optional.empty();
       Integer sum = null;
        Double ave =  null;
        for (int score: scores){ sum += score;}

        ave = (double) sum/scores.length;


        //return Optional.of((double) sum / scores.length);
         //Optional o = (sum == null) ? Optional.empty() : Optional.of(scores);
        Optional o = Optional.ofNullable(ave);
            return o;
         }



    public static void main(String[] args) {
        Optional<Double> opt = average(90, 100,56,80);
        if (opt.isPresent()) {
            System.out.println(opt.get());
        }else {
            System.out.println("Not opt");
        }

        Optional<Double> opt2 = average();

        if (opt2.isPresent()) {
            System.out.println(opt2.get());
        }else {
            System.out.println("opt 2 issue: " + opt2);
        }
    }
}
