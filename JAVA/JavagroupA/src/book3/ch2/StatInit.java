package book3.ch2;

import java.util.Scanner;

public class StatInit {
//    Scanner sc = new Scanner(System.in);
    public int x;
    {
        System.out.print(
                "Enter the starting value for x: ");
        x = sc.nextInt();
        System.out.println("you entered: " + x);
    }

    public StatInit(){
        System.out.println("default constructor: ");
    }
}
