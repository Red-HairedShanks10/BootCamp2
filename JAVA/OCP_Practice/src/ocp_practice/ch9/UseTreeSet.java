package ocp_practice.ch9;

public class UseTreeSet {
    static class Rabbit{ int id; }
4: public static void main(String[] args) {
        5: Set<Duck> ducks = new TreeSet<>();
         ducks.add(new Duck("Puddles"));

         Set<Rabbit> rabbits = new TreeSet<>();
        rabbits.add(new Rabbit()); // ClassCastException
         }
}
