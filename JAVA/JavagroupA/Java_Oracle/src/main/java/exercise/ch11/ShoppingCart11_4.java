package exercise.ch11;

import java.util.ArrayList;

public class ShoppingCart11_4 {

    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("Gaming PC");
        items.add("Xbox");
        items.add("Phone");

        System.out.println(items);
        items.add(2, "Belt");
        System.out.println(items);

         // Check for the existence of a particular String element.  
         // Remove it, if it exists.
         if (items.contains ("Shirt")){
           items.remove("Shirt");
         }
         System.out.println(items);
    }
}
