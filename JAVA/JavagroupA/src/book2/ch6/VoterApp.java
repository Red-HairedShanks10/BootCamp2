package book2.ch6;

import java.util.Scanner;

public class VoterApp {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println
                ("Welcome to the voting machine "
                        + "error code decoder.\n\n"
                        + "If your voting machine generates "
                        + "an error code,\n"
                        + "you can use this program to determine "
                        + "the exact\ncause of the error.\n");
        System.out.print("Enter the error code: ");

        int err = sc.nextInt();

        String msg;

        switch (err){
            case 1:
                msg = "Voter marked more than one " + "candidate.\nBallot rejected.";
                break;


            case 2:
                msg = "Box checked and write-in candidate "
                        + "entered.\nBallot rejected.";
                break;
        }







    }
}
