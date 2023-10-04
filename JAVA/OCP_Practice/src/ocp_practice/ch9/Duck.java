/*
package ocp_practice.ch9;
import java.util.*;

import static java.util.Collections.sort;


public class Duck implements Comparable<Duck> {
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    public int compareTo(Duck d) {
        return name.compareTo(d.name);
    }

    public static void main(String[] args) {
        var ducks = new ArrayList<Duck>();
        ducks.add(new Duck("Quack"));
        ducks.add(new Duck("Puddles"));
        //ducks.sort();
        System.out.println(ducks);
    }
}*/


import java.util.ArrayList;
2: import java.util.Collections;
3: import java.util.Comparator;
4:
        5: public class Duck implements Comparable<Duck> {
6: private String name;
7: private int weight;
8:
        9: // Assume getters/setters/constructors provided
        10:
        11: public String toString() { return name; }
12:
         public int compareTo(Duck d) {
        return name.compareTo(d.name);
         }

         public static void main(String[] args) {
         Comparator<Duck> byWeight = new Comparator<Duck>() {
 public int compare(Duck d1, Duck d2) {
                return d1.getWeight()-d2.
                        getWeight();
                 }
 };
         var ducks = new ArrayList<Duck>();
        ducks.add(new Duck("Quack", 7));
        ducks.add(new Duck("Puddles", 10));
         Collections.sort(ducks);
        System.out.println(ducks); // [Puddles, Quack]
     Collections.sort(ducks, byWeight);