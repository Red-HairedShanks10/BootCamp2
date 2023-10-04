package ocp_practice.ch9;

public class UseTreeSet {
    static class Rabbit{ int id; }
 public static void main(String[] args) {
         Set<Duck> ducks = new TreeSet<>();
         ducks.add(new Duck("Puddles"));

         Set<Rabbit> rabbits = new TreeSet<>();
        rabbits.add(new Rabbit());
         }
}
