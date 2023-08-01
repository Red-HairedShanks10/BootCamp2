package book2.ch2;


import java.util.Scanner;

public class ScannerApp {
   static Scanner scannerIn = new Scanner(System.in);

    public static void main(String[] args) {
       System.out.println("enter a number: ");
       int x = scannerIn.nextInt();
       System.out.println("Your number is: " + x );


    }
}
