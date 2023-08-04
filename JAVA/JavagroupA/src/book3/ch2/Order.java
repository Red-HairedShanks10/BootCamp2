package book3.ch2;

public class Order {
    double unitPrice, quantityOrdered;
    public Order(double u, double p){

    }



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
