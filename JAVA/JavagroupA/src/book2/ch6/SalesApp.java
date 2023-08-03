package book2.ch6;

import java.util.Scanner;

public class SalesApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double commissionRate;

        String userClass =sc.nextLine();
        char salesClass = userClass.charAt(0);

        switch (salesClass)
        {
            case 1:
                commissionRate = 0.02;
                break;
            case 2:
                commissionRate = 0.035;
                break;
            case 3:
                commissionRate = 0.05;
                break;
            default:
                commissionRate = 0.0;
                break;
        }

    }


}
