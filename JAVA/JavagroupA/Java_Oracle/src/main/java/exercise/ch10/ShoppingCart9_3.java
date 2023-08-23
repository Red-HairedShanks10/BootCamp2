
package exercise.ch10;


public class ShoppingCart9_3 {
    public static void main(String args[]){
        
         Order9_3 order1 = new Order9_3("Marco", 950.00, "GP", Order9_3.NONPROFIT);//order instance
        System.out.println("For " + order1.name + " Discount is: "+ order1.getDiscount());//display customer's discount
        
         Order9_3 order2 = new Order9_3("Eze", 840.00, "WC", Order9_3.PRIVATE);//order instance
        System.out.println("For " + order2.name + " Discount is: "+ order2.getDiscount());//display customer's discount
        
        Order9_3 order3 = new Order9_3("Zeke", 460.00, "EC", Order9_3.CORP);
        System.out.println("For " + order3.name + " Discount is: "+ order3.getDiscount());//display customer's discount
    }
}
