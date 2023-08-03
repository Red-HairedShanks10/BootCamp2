package book2.ch6;

import java.util.Scanner;

public class CarWashApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("The spar application!\n\n");
        System.out.print("Enter the package code: ");

        String s = sc.next();
        s.toLowerCase();
        char p = s.charAt(0);
        String details = "";

        switch (p) {

            case 'a':
                details += "Massage";

            case 'b':
                details += "\tSauna relaxation ... \n";
                break;

            case 'c':
                details += "\tPedicure ... \n";
                break;

            default:
                details = "That's not one of the codes.";
                break;
        }
        System.out.println("\nThat package includes: \n");
        System.out.println(details);
    }

}
