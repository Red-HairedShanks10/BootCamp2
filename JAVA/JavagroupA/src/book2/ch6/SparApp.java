package book2.ch6;

import java.util.Scanner;

public class SparApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("The spar application!\n\n");
        System.out.print("Enter the package code: ");

        String s = sc.next();//get the user input
        s.toLowerCase();//convert to lower case
        char p = s.charAt(0);//get the one character of the String
        String details = "";//leave details as an empty string...

        switch (p) {//use the p char value for each case

            case 'a'://if char is (a)
                details += "Massage";//display the package for option A

            case 'b'://if b
                details += "\tSauna relaxation ... \n";//display this package
                break;

            case 'c'://if option c
                details += "\tPedicure ... \n";//this package
                break;

            default://if value is none of the cases above
                details = "That's not one of the codes.";//display this message...
                break;
        }
        System.out.println("\nThat package includes: \n");
        System.out.println(details);
    }

}
