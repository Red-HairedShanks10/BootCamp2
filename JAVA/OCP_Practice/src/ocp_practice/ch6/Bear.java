package ocp_practice.ch6;

public class Bear {
    public static void eat() {
        System.out.println("Bear is eating");
    }

    public static void sneeze() {
        System.out.println("Bear is sneezing");
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
