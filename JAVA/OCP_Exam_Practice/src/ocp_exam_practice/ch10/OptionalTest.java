package ocp_exam_practice.ch10;

import java.util.Optional;

public class OptionalTest {
    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) return Optional.empty();
        12: int sum = 0;
        13: for (int score: scores) sum += score;
        14: return Optional.of((double) sum / scores.length);
        15: }
}
