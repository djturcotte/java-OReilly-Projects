import java.util.Random;
import java.util.Scanner;

public class Proj3_3_GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner keyboard = new Scanner(System.in);
        int count = 0;
        int guess = 0;
        int randomNumber;

        randomNumber = random.nextInt(100) + 1;
//        System.out.println("For testing only: " + randomNumber);
        System.out.println("Welcome to the Guess the Number game! Guess an integer from 1-100, inclusive.");

        while(guess != randomNumber) {
            System.out.println("Enter your integer guess");
            guess = keyboard.nextInt();
            count++;

            if(guess < 1 || guess > 100) {
                System.out.println("That was a wasted guess! Pick a number between 1 and 100, inclusive!");
            }
            else if(guess < randomNumber) {
                System.out.println("Your guess was too low!");
            }
            else if(guess > randomNumber) {
                System.out.println("Your guess was too high!");
            }
            else {
                System.out.println("Congratulations!  You guessed the number in " + count + " guesses!  Thanks for Playing!");
            }//end if-else chain
        }//end while
    }//end main
}
