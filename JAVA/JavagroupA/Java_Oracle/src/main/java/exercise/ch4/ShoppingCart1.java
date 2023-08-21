
package exercise.ch4;//4.2

public class ShoppingCart1 {

    public static void main(String[] args) {
        String custName = "Marco";
        String itemDesc = "Gaming PC";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity, and total
        // Do not initialize total.
        double price = 139.99;
        int quantity = 3;
        double tax = 1.34;
        double total;
        
        // Modify message to include quantity.
        message = custName+" wants to purchase "+quantity+ " "+itemDesc;
        
        System.out.println(message);
        
        // Calculate total and then print the total cost.
        total = quantity * price * tax;
        
        System.out.println("Total cost with tax: "+total);
    }
    
}
