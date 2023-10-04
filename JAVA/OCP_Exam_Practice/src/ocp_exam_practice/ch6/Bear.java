package ocp_exam_practice.ch6;

public class Bear {
    public static void eat() {
        System.out.println("Bear is eating");
    }

    public static void sneeze() {
        System.out.println("Bear is sneezing");
    }

    public void hibernate() {
        System.out.println("Bear is hibernating");
    }

}
class Panda extends Beetle{
    public static void eat() {
        System.out.println("Panda is chewing bamboo");
    }

    public static void main(String[] args) {
        eat();
    }
}

class SunBear extends Bear{
  /* public void sneeze() { // DOES NOT COMPILE
        System.out.println("Sun Bear sneezes quietly");
    }*/

  /*  public static void hibernate() { // DOES NOT COMPILE
        System.out.println("Sun Bear is going to sleep");
    }*/
}
