import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age = 0;
        char gender = 'x';

        System.out.println("Please enter your age");
        age = keyboard.nextInt();
        keyboard.nextLine();
        if(age >= 19) {
            System.out.println("Please enter your gender");
            gender = keyboard.next().charAt(0);
            switch (gender) {
                case 'M':
                case 'm':
                    System.out.println("You are welcome to join our fraternity if you like!");
                    break;
                case 'F':
                case 'f':
                    System.out.println("Sorry, this fraternity is for Male students only!");
                    break;
                default:
                    System.out.println("I'm sorry, what is your gender? What you entered is invalid.");
            }// end switch

        }//end if
        else {
            System.out.println("Sorry you must be at least 19 to join our Fraternity");
        }// end else

    }
}
