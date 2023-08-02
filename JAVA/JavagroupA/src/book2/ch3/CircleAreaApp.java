package book2.ch3;

import java.util.Scanner;

public class CircleAreaApp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Welcome to the circle area calculator.");
        System.out.print("Enter the radius of your circle: ");
        double radius = sc.nextDouble();
         double area = Math.PI * (radius * radius);
         System.out.println("your area is: " + area);
    }
}
