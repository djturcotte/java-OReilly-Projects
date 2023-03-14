import java.util.Scanner;
import java.util.ArrayList;

public class Proj4_3_Parallel {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> namesList = new ArrayList<>();
        int[] ageArray = new int[5];

        for(int i = 0; i < 5; i++) {
            System.out.print("Enter a name:\t");
            namesList.add(keyboard.next());

            System.out.print("Enter an age:\t");
            ageArray[i] = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println();
        }//end for

        for (int i = 0; i < 5; i++) {
            System.out.println(namesList.get(i) + " is " + ageArray[i] + " years old");
        }
    }//end main
}
