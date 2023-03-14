import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int inputInteger;
        int remainder;

        System.out.println("Please enter a non-negative Integer");
        inputInteger = keyboard.nextInt();

        remainder = inputInteger % 3;

        if(remainder > 0) {
            System.out.println(inputInteger + " is NOT divisible by 3");
        }
        else {
            System.out.println(inputInteger + " is divisible by 3");
        }

    }//end main
}
