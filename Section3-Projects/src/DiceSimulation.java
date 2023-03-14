import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;
        int dieNum;

        while(count < 10) {
            dieNum = random.nextInt(6) + 1;
            System.out.println("roll of the die is: " + dieNum);
            count++;
        }// end while
    }//end main
}
