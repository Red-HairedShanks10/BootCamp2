package book2.ch5;
/*Using loops to make simple Guessing Game*/
import java.util.Scanner;

public class GuessingGame {
    static Scanner sc = new Scanner(System.in);//set up our scanner

    public static void main(String[] args) {
        boolean keepPlaying = true;//boolean value changed for false if user wants to stop playing
        System.out.println("Let's play a guessing game!");
        while (keepPlaying) {//main while loop continues if boolean value is true
            /*within the main loop body: */
            boolean validInput;//to indicate if the user input is valid
            int number, guess;//to store user's guess
            String answer;//storing the user's answer
            // Pick a random number
            number = (int) (Math.random() * 10) + 1;
            // Get the guess
            System.out.println("\nI'm thinking of a number " + "between 1 and 10.");
            System.out.print("What do you think it is? ");

            do {//this loop gets valid input from user....
                guess = sc.nextInt();
                validInput = true;
                if ((guess < 1) || (guess > 10)) {//make sure user guesses a number between 1-10
                    System.out.print
                            ("I said, between 1 and 10. " + "Try again: ");
                    validInput = false;//set valid input false
                }
            }while (!validInput);//end of do while loop

            // Check the guess
            if (guess == number)//if guess is correct:
                System.out.println("You're right!");
            else//otherwise if guess is incorrect:
                System.out.println("You're wrong! " +
                        "The number was " + number);
            // Play again?
            do {//this loop essentially ask the user if they want to play again
                System.out.print("\nPlay again? (Y or N)");
                answer = sc.next();
                validInput = true;
                if (answer.equalsIgnoreCase("Y")) ;
                else if (answer.equalsIgnoreCase("N"))
                    keepPlaying = false;//set keepPlaying false//if user answer is No
                else
                    validInput = false;//set validInput false if user input is Invalid
            }
            while (!validInput);
        }
        System.out.println("\nThank you for playing!");
    }
}




