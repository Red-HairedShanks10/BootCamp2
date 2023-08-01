package book2.ch2;

/*Using Scanner to work with simple input*/
import java.util.Scanner;

public class ScannerApp {
   static Scanner scannerIn = new Scanner(System.in);//creating an instance of Scanner class

    public static void main(String[] args) {

       System.out.println("enter a number: ");//prompt a user to enter a number
       int x = scannerIn.nextInt();//using Scanner's nextInt() to read the input value?
       System.out.println("Your number is: " + x );//printing the input value...
        //if user inputs a different data type the program crashes
        /*to avoid this we can add an if statement that uses
        * Scanner methods that check for the right input value
        */




    }
}
