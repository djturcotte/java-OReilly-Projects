import java.util.ArrayList;

public class WrapperFun {
    public static void main(String[] args) {
        ArrayList<Integer> myAL = new ArrayList<>();

//        myAL.add(new Integer(10));
//        myAL.add(new Integer(22));
        myAL.add(10);
        myAL.add(22);

        for(int i = 0; i < myAL.size(); i++) {
            System.out.println(myAL.get(i));
        }

        String someValue = "450";
        int numericValue = Integer.parseInt(someValue);
        numericValue += 10;

        System.out.println(numericValue);

        String strPi = "3.14159";
        double numPi = Double.parseDouble(strPi);

        System.out.println(numPi);
    }//end main
}
