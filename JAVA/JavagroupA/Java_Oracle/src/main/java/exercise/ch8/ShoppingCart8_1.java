
package exercise.ch8;//8-1

public class ShoppingCart8_1 {
    public static void main(String[] args){
        Item item1 = new Item();
        
        // Call the setColor method on item1. Print an appropriate message, 
	//  depending upon the return value.

        if (item1.setColor('C')){
            System.out.println("Item1.color = "+item1.color);
        }else System.out.println("Invalid color");
    }
}
