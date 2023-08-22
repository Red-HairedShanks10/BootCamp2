
package exercise.ch5;//5-3

public class ShoppingCart5_3 {

    public static void main(String[] args) {
        // local variables
        String custName = "Marco";
        String message;

        double price = 139.99;
        int quantity = 3;
        double tax = 1.34;

        String[] items = {"Gaming PC","Xbox","Phone","SSD"};
        
        message = custName + " wants to purchase "+items.length+" items.";
        System.out.println(message);
        
        // Iterate through and print out the items from the items array
        System.out.println("Items purchased: ");
        
        for (String item : items ){
           System.out.print(item + ", ");
        }
    }    
}
