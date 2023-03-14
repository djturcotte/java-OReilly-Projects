import java.util.Locale;
import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String fullName;
        String firstName;
        String lastName;
        String spChar = " ";
        char nmChar;
        int whereIsLast;
        int firstLength;

        System.out.println("What is your full name?\t");
        fullName = keyboard.nextLine();
        System.out.println("Full Name: " + fullName);

        int indexOfSpace = fullName.indexOf(" ");
        lastName = fullName.substring(indexOfSpace + 1);
        lastName = lastName.toLowerCase();
        firstName = fullName.substring(0,indexOfSpace);
        firstName = firstName.toUpperCase();

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Full Name: " + firstName + " " + lastName);
    }//end main
}
