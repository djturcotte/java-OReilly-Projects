import java.util.Scanner;

public class Proj3_2_DivisibleByThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int inputInteger;

        System.out.println("Please enter a non-negative Integer");
        inputInteger = keyboard.nextInt();

        if(inputInteger % 3 == 0) {
            System.out.println(inputInteger + " is divisible by 3");
        }
        else {
            System.out.println(inputInteger + " is NOT divisible by 3");
        }//end if else

    }//end main
}
