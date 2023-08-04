package book3.ch2;

public class ActorApp {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Johnny", "Depp", true);
        Actor actor2 = new Actor("Arnold", "From Terminator", false);
        System.out.println(actor1.firstName + "is a good: " + actor1.good);
        System.out.println(actor2.firstName + actor2.lastName + "is a good: " + actor2.good);
    }
}
