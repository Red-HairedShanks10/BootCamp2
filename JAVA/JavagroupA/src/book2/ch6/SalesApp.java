package book2.ch6;

import java.util.Scanner;

public class SalesApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double commissionRate;

        System.out.println("enter a  charater A-C to see your commision Rate: ");
        String userClass =sc.nextLine();
        char salesClass = userClass.charAt(0);

        switch (salesClass)
        {
            case 'A':
            case 'a':
                commissionRate = 0.02;
                break;
            case 'B':
            case 'b':
                commissionRate = 0.035;
                break;
            case 'C':
            case 'c':
                commissionRate = 0.05;
                break;
            default:
                commissionRate = 0.0;
                break;
        }
        System.out.println("commision Rate is " + commissionRate);

    }


}
