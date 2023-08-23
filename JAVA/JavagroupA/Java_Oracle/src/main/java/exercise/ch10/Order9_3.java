
package exercise.ch10;

public class Order9_3 {
    static final char CORP = 'C';
    static final char PRIVATE = 'P';
    static final char NONPROFIT = 'N';
    String name;
    double total;
    String stateCode;
    double discount;
    char custType;

    public Order9_3(String name, double total, String state, char custType) {
        this.name = name;
        this.total = total;
        this.stateCode = state;
        this.custType = custType;
        calcDiscount();
    }
    
    public String getDiscount(){
        return Double.toString(discount) + "%";
    }

    public void calcDiscount() {
        // using switch statements instead of if statements. 

        switch(custType){
            case NONPROFIT://in the case of Nonprofit
                discount = (total > 900)? 10.00 : 5.00;//and if total is over 900 //set discount to 10% otherwise set it to 5%
                break;
            case PRIVATE://in the case of Private
                //and if total is over 900 
                discount = (total > 900)? 7.00 : 0;//set discount to 7% otherwise set it to 0%
                break;
            case (CORP)://in the case of CORP
                
                discount = (total < 500)? 8.00 : 5.00;//set discount to 10% otherwise set it to 5%
                break;
            default:
                System.out.println("Invalid custType");
        }   
    }
}
