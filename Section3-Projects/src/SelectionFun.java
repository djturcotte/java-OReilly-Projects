import java.util.Scanner;

public class SelectionFun {
    public static void main(String[] args) {
        int age;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to the Pub and Grille!");

        System.out.println("Please enter your age");
        age = keyboard.nextInt();
        keyboard.nextLine();

        if(age >= 21) {
            System.out.println("Here, have a beer!");
        }//end if
        else if(age >= 16) {
            System.out.println("Here, have a coke.");
            System.out.println("At least you can drive!");
        }// end else if
        else {
            System.out.println("Here, have a coke.");
        }//end else

        System.out.println("Thanks for coming to the Pub and Grille!");

    }//end main
}
