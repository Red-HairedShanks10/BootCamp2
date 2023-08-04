package book3.ch2;

import java.util.Scanner;

public class PrimeClass {
    Scanner sc = new Scanner(System.in);
    public int x = getX();

    public static void main(String[] args) {

    }

    private int getX() {
        System.out.print("Enter the starting value "
                + "for x: ");
        return sc.nextInt();
    }

}
