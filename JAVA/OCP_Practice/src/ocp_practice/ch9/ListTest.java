package ocp_practice.ch9;

public class ListTest {
    public static void main(String[] args) {
        String[] array = new String[] {"a", "b", "c"};
        17: List<String> asList = Arrays.asList(array); // [a, b, c]
        18: List<String> of = List.of(array); // [a, b, c]
        19: List<String> copy = List.copyOf(asList); // [a, b, c]
    }
}
