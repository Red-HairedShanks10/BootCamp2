package book2.ch5;

import java.util.Scanner;

public class GuessingGame {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean keepPlaying = true;
        System.out.println("Let's play a guessing game!");
        while (keepPlaying) {
            boolean validInput;
            int number, guess;
            String answer;
            // Pick a random number
            number = (int) (Math.random() * 10) + 1;
            // Get the guess
            System.out.println("\nI'm thinking of a number " + "between 1 and 10.");
            System.out.print("What do you think it is? ");


        }
    }
