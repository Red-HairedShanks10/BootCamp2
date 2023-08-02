package book2.ch5;

import java.util.Scanner;

public class NumberPhobia {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num = 2;
        string input; //string input

        while (true) {
            System.out.println(num + " ");
            System.out.print("Do you want to keep counting?" + " (Y or N)");
            input = sc.next();

            if (input.equalsIgnoreCase("N")) {
                break;
                num += 2;
            }else {
                   System.out.println("You quit: ");
            }System.out.println("\nWhew! That was close.\n");
        }

        }
    }

}
