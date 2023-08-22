
package exercise.ch7;//7-2

public class ShoppingCart7_2 {
    public static void main (String[] args){
        String custName = "Marco";
        String firstName;
        int spaceIdx;
        StringBuilder sb;
       
        spaceIdx = custName.indexOf(" ");
        firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);
          
        //Instantiate and initialize sb to firstName.
        sb = new StringBuilder(firstName);

	// Put the full name back together, using StringBuilder append method.
	//   You can just enter the String literal for the last name.
	//   Print the full name.
        sb.append(" Smith");
	
	// Challenge: sb.append(custName.substring(spaceIdx));

        System.out.println(sb);
    }    
}
