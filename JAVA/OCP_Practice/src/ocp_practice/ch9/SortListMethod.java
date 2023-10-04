package ocp_practice.ch9;

public class SortListMethod {
    public static void main(String[] args) {
        List<String> bunnies = new ArrayList<>();
        4: bunnies.add("long ear");
        5: bunnies.add("floppy");
        6: bunnies.add("hoppy");
        System.out.println(bunnies); // [long ear, floppy, hoppy]
       bunnies.sort((b1, b2) ->
                b1.compareTo(b2));
      System.out.println(bunnies); // [floppy, hoppy, long ear]
    }
}
