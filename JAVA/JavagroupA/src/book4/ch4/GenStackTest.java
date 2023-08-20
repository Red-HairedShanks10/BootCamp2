package book4.ch4;

public class GenStackTest {
    public static void main(String[] args) {

            GenStack<String> gs = new GenStack<String>();

        System.out.println("Pushing four items onto the stack.");
        gs.push("One");
        gs.push("Two");
        gs.push("three");
        gs.push("four");
        gs.push("five");
        System.out.println("There are " + gs.size() + " items in the stack.\n");
        System.out.println("The top item is: " +gs.peek() + "\n");
        System.out.println("There are still " + gs.size() + " items in the stack.\n");
        System.out.println("Popping everything:");

    }
}
