package ocp_exam_practice.ch10;

import java.util.Optional;

public class OptionalTest {
    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) return Optional.empty();
       int sum = 0;
        for (int score: scores) sum += score;
        return Optional.of((double) sum / scores.length);
         }

    public static void main(String[] args) {
        Optional<Double> opt = average(90, 100,56,80);
        if (opt.isPresent()) {
            System.out.println(opt.get());
        }else {
            System.out.println("Not opt");
        }

        Optional<Double> opt2 = average();
       System.out.println(opt2);
    }
}
