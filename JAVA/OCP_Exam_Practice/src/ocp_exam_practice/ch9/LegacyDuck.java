package ocp_exam_practice.ch9;

public class LegacyDuck implements Comparable{

    private String name;
    public int compareTo(Object obj) {
        LegacyDuck d = (LegacyDuck) obj;
        return name.compareTo(d.name);
    }

    public static void main(String[] args) {
        var duck1 = new LegacyDuck();
        var duck2 = new LegacyDuck();

        duck1.name = "Daffy";
        duck2.name = "Donaldo";

        System.out.println(duck1.compareTo(duck2));
        System.out.println(duck1.compareTo(duck1));
        System.out.println(duck2.compareTo(duck1));
    }
}
