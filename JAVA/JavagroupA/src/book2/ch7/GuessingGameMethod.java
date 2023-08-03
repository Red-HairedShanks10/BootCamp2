package book2.ch7;

import java.util.Scanner;

public class GuessingGameMethod {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Let's play a guessing game!");

        do {//main method do while loop//it will continue until the user wants to quit
            playARound();//plays one round of the game
        } while (askForAnotherRound());//user can ask for a round//if true the do another round

        System.out.println("\nThank you for playing!");
    }

    public static void playARound() {//play a single round

        boolean validInput;//for valid user input
        int number, guess;//random number and guess of the user
        String answer;//user's answer
// Pick a random number
        number = getRandomNumber();//calls getRandomNumber
// Get the guess
        System.out.println("\nI'm thinking of a number "
                + "between 1 and 10.");
        System.out.print("What do you think it is? ");
        guess = getGuess();//calls getGuess()
// Check the guess
        if (guess == number) {//check if the guess is the correct number
            System.out.println("You're right!");
        }
        else {
            System.out.println("You're wrong!" + " The number was " + number);
        }

    }

    public static int getRandomNumber() {
        return (int) (Math.random() * 10) + 1;
    }

    public static int getGuess() {
        while (true) {
            int guess = sc.nextInt();
            if ((guess < 1) || (guess > 10)) {
                System.out.print("I said, between 1 and 10. "
                        + "Try again: ");
            } else
                return guess;
        }
    }

    public static boolean askForAnotherRound() {
        while (true) {
            String answer;
            System.out.print("\nPlay again? (Y or N) ");
            answer = sc.next();
            if (answer.equalsIgnoreCase("Y"))
                return true;
            else if (answer.equalsIgnoreCase("N"))
                return false;
        }
    }


}