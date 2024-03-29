package exercise.ch13;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ShoppingCart13_2 {
    ArrayList<Item13_2> items = new ArrayList();
    
    public static void main(String[] args){
        ShoppingCart13_2 cart = new ShoppingCart13_2();
        cart.fillCart();
        cart.removeItemFromCart("Trousers");
    }
    
    public void fillCart(){
        items.add(new Shirt13_2(40.95,'M','R'));
        items.add(new Shirt13_2(32.99,'M','Y'));
        items.add(new Trousers13_2 (59.99,34,'B',"Relaxed",'M'));
        items.add(new Trousers13_2 (75.50,8,'G',"Skinny",'F'));
    }
    
    public void removeItemFromCart(String desc){
        // remove all Trousers from the items list, then print out the list
        items.removeIf(i -> i.getDesc().equals(desc));
        System.out.println("Cart after removing Trousers: \n"+items);
    }
    
}
