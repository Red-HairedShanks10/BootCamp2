package book3.ch2;

import java.util.Scanner;

public class OrderApp {

    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Order order1 = new Order();
        order1.setQuantityOrdered(2);
        order1.setUnitPrice(20);
        System.out.println(order1.getOrderTotal());
    }

}
