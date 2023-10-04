package ocp_practice.ch9;

public class SortRabbits {
    static record Rabbit(int id) {}
4: public static void main(String[] args) {
       List<Rabbit> rabbits = new ArrayList<>();
        rabbits.add(new Rabbit(3));
      rabbits.add(new Rabbit(1));
       Collections.sort(rabbits); // DOES NOT COMPILE
         } }
}
