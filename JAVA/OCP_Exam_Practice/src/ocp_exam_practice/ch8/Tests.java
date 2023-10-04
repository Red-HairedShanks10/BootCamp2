package ocp_exam_practice.ch8;

import java.util.List;

public class Tests {
    public static void main(String[] args) {
        Function<List<String>,String> ex1 = x -> x.get(0);
        UnaryOperator<Long> ex2 = (Long l) -> (long) 3.14;

    }
}
