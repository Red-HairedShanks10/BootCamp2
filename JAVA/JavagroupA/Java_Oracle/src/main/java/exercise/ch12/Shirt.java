package exercise.ch12;

public class Shirt extends Item12_1{
    private char size;
    private char colorCode;
    
    public Shirt(double shPrice, char size, char colorCode){
        super ("Shirt", shPrice);//calling Item constructor
        this.size = size;
        this.colorCode = colorCode;
    } 
}
