import java.util.Scanner;
import java.util.ArrayList;

public class Proj4_3A_Parallel {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a name:\t");
            names.add(keyboard.next());

            System.out.print("Enter an age:\t");
            ages.add(keyboard.nextInt());
            keyboard.nextLine();

            System.out.println();
        }//end for

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " is " + ages.get(i) + " years old");
        }
    }//end main
}
