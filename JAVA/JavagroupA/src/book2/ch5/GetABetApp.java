package book2.ch5;

import java.util.Scanner;
public class GetABetApp {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double bank = 1000; // assume the user has $1,000
        double bet = 0; // the bet entered by the user
        System.out.println("You can bet between 1 and " + bank);

        do
        {
           System.out.print("Enter your bet: ");
            bet = sc.nextDouble();
        } while ( (bet <= 0) || (bet > bank) );
        System.out.println("Your money's good here.");
    }
    }


