
package exercise.ch7;//7-1

public class ShoppingCart7_1 {
    public static void main (String[] args){
        String custName = "Marco";
        String firstName;
        int spaceIdx;
        
        // Get the index of the space character (" ") in custName.
        spaceIdx = custName.indexOf(" ");

	// Use the substring method to parse out the first name and print it.
        firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);
    }
}
