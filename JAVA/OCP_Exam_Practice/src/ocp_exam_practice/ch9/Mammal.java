package ocp_exam_practice.ch9;

import java.util.*;

public class Mammal {
    public List<CharSequence> play() {
        return new ArrayList<>();
    }

    public CharSequence sleep() {
        return "zzz";
    }
}

class Monkey extends Mammal {
    public ArrayList<CharSequence> play() {
        return new ArrayList<>();
    }
}

class Goat extends Mammal {
    // public List<String>  play() {return new ArrayList<>();}
    public String sleep() {
        return "brrr";
    }
}
