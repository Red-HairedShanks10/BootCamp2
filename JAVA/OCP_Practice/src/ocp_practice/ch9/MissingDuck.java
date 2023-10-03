package ocp_practice.ch9;
import java.util.*;

public class MissingDuck {
    public static void main(String[] args) {
        private String name;
        public int compareTo(MissingDuck quack) {
            if (quack == null)
                throw new IllegalArgumentException("Poorly formed duck!");
            if (this.name == null && quack.name == null)
                return 0;
            else if (this.name == null) return -1;
            else if (quack.name == null) return 1;
            else return name.compareTo(quack.name);
        }
    }
}
