package ocp_practice.ch9;/*
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
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.*;

public class Duck implements Comparable<Duck> {
    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return name;
    }

    public int compareTo(Duck d) {
        return name.compareTo(d.name);
    }

    public static void main(String[] args) {
        Comparator<Duck> byWeight = new Comparator<Duck>() {
            public int compare(Duck d1, Duck d2) {
                return d1.getWeight() - d2.getWeight();
            }
        };
        var ducks = new ArrayList<Duck>();
        ducks.add(new Duck("Quack", 7));
        ducks.add(new Duck("Puddles", 10));
      //  ducks.sort(ducks.);
        System.out.println(ducks);
        ducks.sort(byWeight);
        System.out.println(ducks);
    }
}

