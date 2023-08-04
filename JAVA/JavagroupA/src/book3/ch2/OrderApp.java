package book3.ch2;

import java.util.Scanner;

public class OrderApp {

   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter quantity of product");
        double qtyOrder = sc.nextDouble();
        Order order1 = new Order();
        order1.setQuantityOrdered(qtyOrder);
        order1.setUnitPrice(20);
        System.out.println(order1.getOrderTotal());
    }

}
