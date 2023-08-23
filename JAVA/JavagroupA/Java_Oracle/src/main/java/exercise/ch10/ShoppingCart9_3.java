
package exercise.ch10;


public class ShoppingCart9_3 {
    public static void main(String args[]){
         Order9_3 order1 = new Order9_3("Marco", 950.00, "GP", Order9_3.NONPROFIT);
        System.out.println("For " + order1.name + " Discount is: "+ order1.getDiscount());
        
         Order9_2 order2 = new Order9_2("Eze", 840.00, "WC", Order9_2.PRIVATE);
        System.out.println("For " + order2.name + " Discount is: "+ order2.getDiscount());
    }
}
