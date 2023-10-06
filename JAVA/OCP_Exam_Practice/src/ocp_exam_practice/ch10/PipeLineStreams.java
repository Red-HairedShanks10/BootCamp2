package ocp_exam_practice.ch10;

import java.util.List;

public class PipeLineStreams {
    public static void main(String[] args) {
        var list = List.of("Toby", "Anna", "Leroy", "Alex");

        list.stream().filter(n -> n.length() == 4).sorted()
                .limit(2).forEach(System.out::println);
        

    }
}
