import java.util.Scanner;
import java.util.ArrayList;

public class Proj4_2_ArrayLists {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Double> myList = new ArrayList<>();

        double input;

        System.out.println("Enter a real number 0 or more to put in a list or -1 to exit");
        input = keyboard.nextDouble();

        while (input >= 0){
            myList.add(input);
            System.out.println("Enter a real number 0 or more to put in a list or -1 to exit");
            input = keyboard.nextDouble();
        }//end while

        for(int i = myList.size() - 1 ; i >= 0 ; i--) {
            System.out.println(myList.get(i));
        }//end for

    }//end main
}
