
package exercise.ch11;

public class ShoppingCart11_3 {
    Item11_3[] items = {new Item11_3("Phone",55.70), 
                    new Item11_3("Gaming PC",123.12), 
                    new Item11_3("Xbox",135.95)};
    
    public static void main(String[] args){   
        ShoppingCart11_3 cart = new ShoppingCart11_3();
        cart.displayTotal();
    }
    
    public void displayTotal(){
        double total = 0;
        for(int i = 0; i< items.length; i++){
            if(items[i].isBackOrdered()) 
		continue;
            total += items[i].getPrice();
        }
        System.out.println("Shopping Cart total: "+total);
    }
}
