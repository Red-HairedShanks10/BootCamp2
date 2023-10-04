package ocp_practice.ch9;

public class SortRabbits {
    static record Rabbit(int id) {}
4: public static void main(String[] args) {
        5: List<Rabbit> rabbits = new ArrayList<>();
        6: rabbits.add(new Rabbit(3));
        7: rabbits.add(new Rabbit(1));
       Collections.sort(rabbits); // DOES NOT COMPILE
         } }
}
