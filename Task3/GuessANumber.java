import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    private static int rnd_number;

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?...");
        makeAGuess();
    }

    private static void makeAGuess(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats your guess?");
        
        if (scanner.hasNextInt()) { // Checking if the input is a number
            int guess = scanner.nextInt(); // Gets the user input
            
            if (guess == rnd_number) {
                System.out.println("Cool! You guessed the number!");
            } else {
                if (guess < rnd_number) {
                    System.out.println("Your guess is too low. Try again.");
                } else {
                    System.out.println("Your guess is too high. Try again.");
                }
                makeAGuess(); // Lets the user try it again. "recursion"
            }
        } else {
            System.out.println("That input is not a valid number");
            scanner.next();
            makeAGuess(); // Lets the user try it again. "recursion"
        }
    }
}
