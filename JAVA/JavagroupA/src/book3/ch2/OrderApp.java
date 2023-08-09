package book3.ch2;

import java.text.NumberFormat;
import java.util.Scanner;


public class OrderApp {

   static Scanner sc = new Scanner(System.in);//
   static NumberFormat cf = NumberFormat.getCurrencyInstance();//
    public static void main(String[] args) {

        System.out.println("Enter quantity of product");
        double qtyOrder = sc.nextDouble();
        Order order1 = new Order();
        order1.setQuantityOrdered(qtyOrder);
        order1.setUnitPrice(20);
        System.out.println("Total cost of your order: " + cf.format(order1.getOrderTotal()));

    }

}
