import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int roundsWon = 0;
        String playAgain;

        do {
            int target = rand.nextInt(100) + 1; // 1–100
            int attempts = 0;
            int guess = 0;
            System.out.println("I have chosen a number between 1 and 100.");

            // limit attempts if desired, e.g. max 10
            int maxAttempts = 10;

            while (guess != target && attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess < target) {
                    System.out.println("Too low!");
                } else if (guess > target) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                    roundsWon++;
                }
            }

            if (guess != target) {
                System.out.println("Out of attempts! The number was: " + target);
            }

            System.out.print("Play another round? (yes/no): ");
            playAgain = sc.next();
        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("You won " + roundsWon + " round(s). Thanks for playing!");
        sc.close();
    }
}