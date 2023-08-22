
package exercise.ch8;//8-2

public class ShoppingCart8_2 {

    public static void main(String[] args) {
        Item8_2 item1 = new Item8_2();

        // Call the 3-arg setItemFields method and then call displayItem.
        item1.setItemFields("Gaming PC", 1, 134.95);
        item1.displayItem();

        // Call the 4-arg setItemFields method, checking the return value.
        int retcode = item1.setItemFields("Xbox", 2, 144.99, 'B');
        if (retcode < 0) {
            System.out.println("Invalid color code.");
        } else {
            item1.displayItem();
        }
    }
}
