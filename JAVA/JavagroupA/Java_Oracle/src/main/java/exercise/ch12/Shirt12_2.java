package exercise.ch12;

public class Shirt12_2 extends Item12_2{
    private char size;
    private char colorCode;
    
    public Shirt12_2(double price, char size, char colorCode){
        super ("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    }
    // Override the display method in Item to also show size and colorCode.
       // Avoid duplicating code.
    public void display(){
        super.display();
        System.out.println("\tSize: "+size);
        System.out.println("\tColor Code: "+ colorCode);
    } 
}
