package book3.ch2;

public class Order {
///we can have contructor overloading(but for what purpose?)
//    double unitPrice, quantityOrdered;

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double uPrice) {
        this.unitPrice = uPrice;
    }


    //for
    public double getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(double qtyOrdered) {
        this.quantityOrdered = qtyOrdered;
    }

    public double getOrderTotal(){
        return unitPrice * quantityOrdered;
    }
}
