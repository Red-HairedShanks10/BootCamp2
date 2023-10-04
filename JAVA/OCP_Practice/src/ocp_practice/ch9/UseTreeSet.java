package ocp_practice.ch9;

public class UseTreeSet {
    static class Rabbit{ int id; }
4: public static void main(String[] args) {
        5: Set<Duck> ducks = new TreeSet<>();
        6: ducks.add(new Duck("Puddles"));
        7:
        8: Set<Rabbit> rabbits = new TreeSet<>();
        9: rabbits.add(new Rabbit()); // ClassCastException
         }
}
