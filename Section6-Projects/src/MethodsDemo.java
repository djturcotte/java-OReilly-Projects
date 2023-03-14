

public class MethodsDemo {
    public static void main(String[] args) {
        printHello();
        printNumber(10);
        int result = giveMe10();  //argument 10 is passed in
        System.out.println(result);
        double dResult;

        result = addThese(3,5);  //argument 3 and 5 passed in
        System.out.println(result);

        dResult = dblSquare(5.5);
        System.out.println(dResult);

        System.out.println(dblSquare(7.25));

    }//end main

    //void, parameterless method
    public static void printHello() {
        System.out.println("Hello there!");
    }//end printHello

    //void, parameterized method
    public static void printNumber(int a) {
        System.out.println("The number is " + a);
    }//end printNumber

    //value-returning, parameterless method
    public static int giveMe10() {
        return 10;
    }//end giveMe10

    //value-returning parameterized method
    public static int addThese(int num1, int num2) {
        return num1 + num2;
    }//end addThese

    public static double dblSquare(double num) {
        //double result = num * num;
        //return result;
        return num * num;
    }
}
