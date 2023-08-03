package book2.ch6;

/*Exploring how switch statement works vs else if Statement*/
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
                msg = "case 1: Voter marked more than one " + "candidate.\nBallot rejected.";
                break;

            case 2:
                msg = "case 2: Box checked and write-in candidate " + "entered.\nBallot rejected.";
                break;

            case 3:
                msg = "case 3: Entire ballot was blank.\n" + "Ballot filled in according to " + "secret plan.";
                break;

            case 4:
                msg = "case 4: Nothing unusual about the ballot.\n" + "Voter randomly selected for tax audit.";
                break;

            case 5:
                msg = "case 5: Voter filled in every box.\n" + "Ballot counted twice.";
                break;

            case 6:
                msg = " case 6: Voter drooled in voting machine.\n" + "Beginning spin cycle.";
                break;

            default:
                msg = " Default: Voter filled out ballot correctly.\n" + "Ballot discarded anyway.";
                break;
        }
        System.out.println(msg);
    }
}
