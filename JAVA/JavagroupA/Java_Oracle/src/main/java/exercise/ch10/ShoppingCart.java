
package exercise.ch10;

public class ShoppingCart {
    public static void main(String args[]){
        Order order = new Order("Marco", 950.00, "JH", Order.NONPROFIT);
        System.out.println("Discount is: "+ order.getDiscount());
    }
}
