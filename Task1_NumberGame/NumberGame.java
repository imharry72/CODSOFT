import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Generate random number between 1 and 100
        int secretNumber = (int)(Math.random() * 100) + 1;

        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to Number Guessing Game");
        System.out.println("Guess a number between 1 and 100");

        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println("Too High, try again");
            } 
            else if (guess < secretNumber) {
                System.out.println("Too Low, try again");
            } 
            else {
                System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
            }
        }

        sc.close();
    }
}
