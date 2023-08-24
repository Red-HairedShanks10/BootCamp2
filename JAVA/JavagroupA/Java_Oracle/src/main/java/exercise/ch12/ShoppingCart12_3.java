package exercise.ch12;

public class ShoppingCart12_3 {
    public static void main(String[] args) {
         // declare and instantiate a Shirt object using an Item reference type
        Item12_3 item = new Shirt12_3(35.95, 'L', 'R');
        
        
        // call the display method on the object, then the getColor method
        item.display();
         if (item instanceof Shirt) {
              String color = ((Shirt) item).getColor();
    }
}
