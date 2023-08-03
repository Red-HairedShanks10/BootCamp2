package book2.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetInteger2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter an integer: ");
        int i = GetAnInteger();
        System.out.println("You entered " + i);
    }
    public static int GetAnInteger(){

        while(true){

            try {
                return sc.nextInt();
            }catch (InputMismatchException ex){
                sc.next();

            }

        }
    }

}
