
package exercise.ch7;//7-3

public class ShoppingCart7_3 {

    public static void main(String[] args) {
        int int1;
        
	//  Declare and initialize variables of type long, float, and char.
        
        long long1 = 7_000_000_000L;
        float flt1 = 13.5F;
        char ch1 = 'U';
        
	// Print the long variable.
	System.out.println("long1: "+long1);

        // Assign the long to the int and print the int variable.
        int1 = (int) long1; 
        System.out.println("Long assigned to int var: " + int1);
    }
}
