
package exercise.ch11;

public class ShoppingCart11_3 {
    Item11_3[] items = {new Item11_3("Shirt",25.60), 
                    new Item11_3("WristBand",1.00), 
                    new Item11_3("Pants",35.99)};
    
    public static void main(String[] args){   
        ShoppingCart11_3 cart = new ShoppingCart11_3();
        cart.displayTotal();
    }
    
    public void displayTotal(){
        double total = 0;
        for(int idx = 0; idx < items.length; idx++){
            if(items[idx].isBackOrdered()) 
		continue;
            total += items[idx].getPrice();
        }
        System.out.println("Shopping Cart total: "+total);
    }
}
