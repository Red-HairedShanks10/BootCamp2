package ocp_exam_practice.ch9;

import java.util.*;

public class Mammal {
    public List<CharSequence> play() { ... }
    public CharSequence sleep() { ... }
}
public class Monkey extends Mammal {
    public ArrayList<CharSequence> play() { ... }
}
public class Goat extends Mammal {
    public List<String> play() { ... } // DOES NOT COMPILE
    public String sleep() { ... }
}
