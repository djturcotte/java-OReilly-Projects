import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] names = new String[5];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter a name:\t");
            names[i] = keyboard.nextLine();
        }//end for

        for (int i = 0; i < names.length; i++) {
            System.out.println("Hello " + names[i]);
        }
    }
}
