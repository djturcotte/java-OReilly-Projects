
public class CountDown {
    public static void main(String[] args) {
//        countDownFrom(10);
        countUpTo(10,20);
    }//end main

    public static void countDownFrom(int num) {
        if(num >= 0) {
            System.out.println(num);
            countDownFrom(num - 1);
        }//end countDownFrom
    }

    public static void countUpTo(int num1, int num2) {
        if(num1 <= num2) {
            System.out.println(num1);
            countUpTo(num1 + 1, num2);
        }
    }
}
