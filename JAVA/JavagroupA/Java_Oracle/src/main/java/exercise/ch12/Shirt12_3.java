package exercise.ch12;

public class Shirt12_3 extends Item12_3{
    private char size;
    private char colorCode;
    
    public Shirt12_3(double price, char size, char colorCode){
        super ("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    }
    
    public void display(){
        super.display();
        System.out.println("\tSize: "+size);
        System.out.println("\tColor Code: "+ colorCode);
    } 
    
    // Code a public getColor method that converts the colorCode to a the color name
       // Use a switch statement.  Return the color name. 
    public String getColor(){
        String color = "";
         switch (colorCode){
            case 'R':
                color = "Red";
                break;
    }

}
