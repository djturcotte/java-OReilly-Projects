import java.util.Locale;

public class StringMethods2 {
    public static void main(String[] args) {
        String myName = "Doug Turcotte";

        String upper = myName.toUpperCase();
        String lower = myName.toLowerCase();

        int whereIsT = myName.indexOf("T");

        String lastName = myName.substring(5);

        System.out.println("upper is " + upper);
        System.out.println("lower is " + lower);
        System.out.println("T is at index" + whereIsT);
        System.out.println("Last name is " + lastName);
    }//end main
}
