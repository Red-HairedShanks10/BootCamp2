package exercise.ch13;

public class Item13_2 {
    private int id;
    private String desc;
    private double price;
    private char colorCode;
    static int nextId = 1;
    
    // Default constructor sets default values
    public Item13_2(){
        setId();
        setDesc("No description assigned.");
        setPrice(0.00);
        setColorCode('U');
    }
    
    // Overloaded constructor takes description and price
    public Item13_2(String desc, double price, char cCode) {
        setId();
        setDesc(desc);
        setPrice(price);
        setColorCode(cCode);
    }
    
    public void display(){
        System.out.println("Item description: "+getDesc());
        System.out.println("\tID: "+getId());
        System.out.println("\tPrice: "+getPrice());
        System.out.println("\tColor: "+getColorCode());
    }

    // Getter and Setter methods
    private void setId() {
        id = Item13_2.nextId++;
    }

    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    private void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    public char getColorCode() {
        return colorCode;
    }

    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }
    
    public String toString(){
       return this.getDesc();
    }
}
