package ocp_practice.ch9;

import java.util.*;

public class SortRabbits {
    record Rabbit(int id) {
    }

    public static void main(String[] args) {
        List<Rabbit> rabbits = new ArrayList<>();
        rabbits.add(new Rabbit(3));
        rabbits.add(new Rabbit(1));
        Collections.sort(rabbits);
    }
}
