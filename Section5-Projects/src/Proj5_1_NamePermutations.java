import java.util.ArrayList;
import java.util.Scanner;

public class Proj5_1_NamePermutations {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String fullName;
        ArrayList<String> first = new ArrayList<>();
        ArrayList<String> last = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Please enter name " + (i + 1) + "\t");
            fullName = keyboard.nextLine();

            int indexOfSpace = fullName.indexOf(" ");
            first.add(fullName.substring(0, indexOfSpace));
            last.add(fullName.substring(indexOfSpace + 1));
        }// end for

        for (int i = 0; i < first.size(); i++) {
            StringBuilder outName = new StringBuilder(first.get(i));
            for (int j = 0; j < last.size(); j++) {
                if(j == 0) outName.append(" " + last.get(j));
                else {
                    int outIndOfSpace = outName.indexOf(" ");
                    int endOfName = outName.length();
                    outName.replace((outIndOfSpace + 1), endOfName, last.get(j));
                }
                System.out.println(outName);
            }
        }
    }//end main
}
