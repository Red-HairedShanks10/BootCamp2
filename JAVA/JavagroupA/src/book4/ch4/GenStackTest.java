package book4.ch4;

public class GenStackTest {
    public static void main(String[] args) {

            GenStack<String> gs = new GenStack<String>();

        System.out.println("Pushing four items onto the stack.");
        gs.push("One");
        gs.push("Two");
        gs.push("three");
        gs.push();
        gs.push();

    }
}
