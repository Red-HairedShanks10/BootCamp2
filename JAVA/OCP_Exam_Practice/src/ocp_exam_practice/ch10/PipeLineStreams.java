package ocp_exam_practice.ch10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PipeLineStreams {
    public static void main(String[] args) {
        var list = List.of("Toby", "Anna", "Leroy", "Alex");

       /* list.stream().filter(n -> n.length() == 4)
                .sorted()
               .limit(2)
                .forEach(System.out::println);*/

        /*Stream.generate(() -> "Elsa")
                .filter(n -> n.length() == 4)
                .limit(2)
              //  .sorted()
                .forEach(System.out::println);*/

       /* long count = Stream.of("goldfish", "finch")
                .filter(s -> s.length() > 5)
                .peek(System.out::println)
                .collect(Collectors.toList())
                .stream()
                .count();
        System.out.println("count of fish?: " + count);*/

        List<String> stringList = Stream.of("finch", "goldfish").toList()
                .stream().filter(n -> n.length() > 5)
                .peek(System.out::println)
                .collect(Collectors.toList());

        Long count = stringList.stream().count();

        System.out.println(count);


    }
}
