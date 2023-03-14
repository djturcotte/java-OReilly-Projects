import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int input;
        int sum = 0;

        System.out.println("Enter a non-negative Integer to add to sum");
        System.out.println("Enter a negative to exit");
        input = keyboard.nextInt();

        while(input > 0) {
            sum += input;

            System.out.println("Enter a non-negative Integer");
            System.out.println("Or negative to exit");
            input = keyboard.nextInt();

        }//end while

        System.out.println("Sum is " + sum);

    }//end main
}
