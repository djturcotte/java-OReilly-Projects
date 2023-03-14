

public class StringMethods1 {
    public static void main(String[] args) {
        String name = "Doug Turcotte";
        String name2 = "Doug Turcotte";
        String name3 = "Rob Percival";

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }//end for

        System.out.println();

        if(name.equals(name2)) {
            System.out.println("Names are equal.");
        }
        else {
            System.out.println("Names are NOT equal");
        }

        if (name.compareTo(name3) > 0) {
            System.out.println("name > name3");
        }
        else {
            System.out.println("name <= name3");
        }
        if (name3.compareTo(name2) > 0) {
            System.out.println("name3 > name2");
        }
        else {
            System.out.println("name3 <= name2");
        }
    }//end main

}
