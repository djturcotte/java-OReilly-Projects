import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] someValues = new int[5];

        System.out.println("Please enter 5 integers when prompted");

        for(int i = 0; i < someValues.length; i++) {
            System.out.print("enter an integer\t");
            someValues[i] = keyboard.nextInt();
        }

        for(int sumInput : someValues) {
//            sumInput *= 2;
            System.out.println("result is " + (sumInput *= 2));
        }

    }// end main
}
