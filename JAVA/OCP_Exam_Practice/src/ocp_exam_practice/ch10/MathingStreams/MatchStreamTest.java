package ocp_exam_practice.ch10.MathingStreams;

public class MatchStreamTest {
    public static void main(String[] args) {
        var list = List.of("monkey", "2", "chimp");
        Stream<String> infinite = Stream.generate(() ->
                "chimp");
        Predicate<String> pred = x ->
                Character.isLetter(x.charAt(0));
        System.out.println(list.stream().anyMatch(pred)); // true
        System.out.println(list.stream().allMatch(pred)); // false
        System.out.println(list.stream().noneMatch(pred)); // false
    }
}
