import java.util.Scanner;

public class Proj6_2_TicTacToe {
    public static void main(String[] args) {
        String winner;
        String[][] gameBoard = new String[3][3];

        initializeGameBoard(gameBoard);
        printCurrentBoard(gameBoard);
    }//end main

    public static void runGame() {

    }//end runGame

    public static void initializeGameBoard(String[][] gameBoard) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameBoard[i][j] = " ";
            }
        }
    }//end initializeGameBoard

    public static void printCurrentBoard(String[][] gameBoard) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(j < 2) {
                    System.out.print(gameBoard[i][j] + " | ");
                } else {
                    System.out.println(gameBoard[i][j]);
                }//end if
            }
            if(i < 2) {
                System.out.println("- - - - -");
            }
        }

    }//end printCurrentBoard

    public static void getUserInput(boolean xTurn, String[][] gameBoard) {
        Scanner keyboard = new Scanner(System.in);

    }//end getUserInput

    public static boolean cellAlreadyOccupied(int row, int col, String[][] gameBoard) {
        return false;
    }//end cellAlreadyOccupied

    public static String getWinner(String[][] gameBoard) {
        return "";
    }//end getWinner

    public static boolean isBoardFull(String[][] gameBoard) {
        return false;
    }//end isBoardFull
}
