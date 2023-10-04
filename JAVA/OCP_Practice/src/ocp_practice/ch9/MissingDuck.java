package ocp_practice.ch9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MissingDuck {


    private String name;

    public MissingDuck(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public int compareTo(MissingDuck quack) {
        if (quack == null){
            throw new IllegalArgumentException("Poorly formed duck!");
        }



        if (this.name == null && quack.name == null) {
            System.out.println("Both names are null: ");
            return 0;
        }
        else if (this.name == null){
            System.out.println("this name is null");
            return -1;
        }
        else if (quack.name == null) {
            System.out.println("quack name is null");
            return 1;
        }
        else {return name.compareTo(quack.name);}
    }

    public static void main(String[] args) {
        MissingDuck mDuck1 = new MissingDuck("Kurama");
        MissingDuck mDuck2 = new MissingDuck("Kurapika");
        List<MissingDuck> ducks = new ArrayList<MissingDuck>();

        ducks.add(mDuck1);
        ducks.add(mDuck2);

        mDuck1.compareTo(mDuck1);
        mDuck2.compareTo(mDuck1);
        mDuck1.compareTo(mDuck2);
        Collections.sort(ducks);
        System.out.println(ducks);


    }
}