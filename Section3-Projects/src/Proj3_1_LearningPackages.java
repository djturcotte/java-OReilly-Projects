import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int totCost = 0;
        int pkgNum = 0;
        int mmChg = 0;
        int addlChg = 0;
        int mmAlloc = 0;
        int taken = 0;

        System.out.println("Which of the packages do you want? 1, 2, or 3?");
        pkgNum = keyboard.nextInt();

        System.out.println("How many courses did you enroll in this month?");
        taken = keyboard.nextInt();

        if(pkgNum > 0 && pkgNum < 4 && taken > 0) {
            switch (pkgNum) {
                case 1:
                    mmChg = 10;
                    addlChg = 6;
                    mmAlloc = 2;
                    break;
                case 2:
                    mmChg = 12;
                    addlChg = 4;
                    mmAlloc = 4;
                    break;
                case 3:
                    mmChg = 15;
                    addlChg = 3;
                    mmAlloc = 6;
                    break;
                default:
                    System.out.println("Invalid Package Number entered, bye");
            }//end switch
            totCost = mmChg + (taken - mmAlloc) * addlChg;
            System.out.println("Your total cost for this month is $" + totCost);
        }//end if

    }//end main
}
