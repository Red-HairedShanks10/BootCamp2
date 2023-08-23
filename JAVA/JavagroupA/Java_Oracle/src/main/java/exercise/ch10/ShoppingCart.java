
package exercise.ch10;

public class ShoppingCart {
    public static void main(String args[]){
        Order order1 = new Order("Marco", 950.00, "JH", Order.NONPROFIT);
        System.out.println("For " + order1.name + " Discount is: "+ order1.getDiscount());
        
        Order order2 = new Order("Eze", 840.00, "JH", Order.PRIVATE);
        System.out.println("For " + order2.name + " Discount is: "+ order2.getDiscount());
    }
}
