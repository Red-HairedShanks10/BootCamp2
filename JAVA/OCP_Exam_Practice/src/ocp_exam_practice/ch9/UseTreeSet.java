package ocp_exam_practice.ch9;

import java.util.*;

public class UseTreeSet {
    static class Rabbit {
        int id;
    }

    public static void main(String[] args) {
        Set<Duck> ducks = new TreeSet<>();
        ducks.add(new Duck("Daffy", 8));

        Set<Rabbit> rabbits = new TreeSet<>();
        rabbits.add(new Rabbit());
    }
}
