
package exercise.ch10;

public class Order9_2 {
    static final char CORP = 'C';
    static final char PRIVATE = 'P';
    static final char NONPROFIT = 'N';
    String name;
    double total;
    String stateCode;
    double discount;
    char custType;

    public Order9_2(String name, double total, String state, char custType) {
        this.name = name;
        this.total = total;
        this.stateCode = state;
        this.custType = custType;
        calcDiscount();
    }
    
    public String getDiscount(){
        return Double.toString(discount) + "%";
    }

    // Code the calcDiscount method//to determine discount for each custType.
    public void calcDiscount() {
        if (custType == NONPROFIT){//if NonProfit....
            if (total > 900){// and if order total is over 900
                discount = 10.00;//set the discount to 10%
            }else discount = 5.00;//otherwise if equal to or less than 900//set it to 5%
        }
        else if (custType == PRIVATE){//if custType is Private
            if (total > 900){//and if total is over 900
                discount = 7.00;//set discount to 7%
            }else discount = 0;//otherwise set discount to 0%
        }
        else if (custType == CORP){//if Corp
            if (total < 500){//and if total is less than 500 
                discount = 8.00;//set discount to  8%
            }else discount = 5.00;
        }        
    }
}
