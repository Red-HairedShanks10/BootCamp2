package exercise.ch12;

public class Shirt extends Item12_1{
    private char size;
    private char colorCode;
    
    public Shirt(double price, char size, char colorCode){
        super ("Shirt", price);//calling Item constructor
        this.size = size;
        this.colorCode = colorCode;
    } 
}
