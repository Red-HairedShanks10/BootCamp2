package exercise.ch12;

public class ShoppingCart12_3 {
    public static void main(String[] args) {
         // declare and instantiate a Shirt object using an Item reference type
        Item12_3 item = new Shirt12_3(35.95, 'L', 'R');
        Item12_3 item2 = new Shirt12_3(25.95, 'M', 'Y');
        
        // call the display method on the object, then the getColor method
        item.display();
         if (item instanceof Shirt12_3) {
              String color = ((Shirt12_3) item).getColor();
               System.out.println("Color: " + color);
                }else System.out.println("this item is not a Shirt.");
         item2.display();
         
    }
    
     
}
