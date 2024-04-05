// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int generatedNumber = random.nextInt(100) + 1;

        Scanner sc =new Scanner(System.in);

        System.out.println("the number: "+generatedNumber);

        // Set the number of attempts
        int maxAttempts = 5;
        int attempts = 0;
        int score = 0;


        // Game loop
        while (attempts < maxAttempts) {

            // Prompt the user to enter a guess
            System.out.println("Guess a number between 1 and 100: ");
            String userInput = sc.next();

            int userGuess;
            try {
                userGuess = Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                // Invalid input, prompt the user again
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            // Increment the attempt count
            attempts++;

            // Check the user's guess
            if (userGuess == generatedNumber) {
                // Correct guess
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                score = maxAttempts - attempts + 1;
                System.out.println("Your score is: " + score);
                break;
            } else if (userGuess < generatedNumber) {
                System.out.println("Your guess is lower than the number. Try again.");
            } else {
                System.out.println("Your guess is higher than the number. Try again.");
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've reached the maximum number of attempts. The number was " + generatedNumber + ".");
        }
    }
}

